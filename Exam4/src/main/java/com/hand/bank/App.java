package com.hand.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
       Map<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
       
       ArrayList<Integer> list0 = new ArrayList<Integer>();
       ArrayList<Integer> list1 = new ArrayList<Integer>();
       ArrayList<Integer> list2 = new ArrayList<Integer>();
       ArrayList<Integer> list3 = new ArrayList<Integer>();
       ArrayList<Integer> list4 = new ArrayList<Integer>();
       ArrayList<Integer> list5 = new ArrayList<Integer>();
       ArrayList<Integer> list6 = new ArrayList<Integer>();
       ArrayList<Integer> list7 = new ArrayList<Integer>();
       ArrayList<Integer> list8 = new ArrayList<Integer>();
       ArrayList<Integer> list9 = new ArrayList<Integer>();
       
      for(int i = 0 ; i < 50 ; i ++ ){
    	  list.add(newRandom());
      }
      System.out.print("随机生成50 个小于100 的数,分别为:");
      for(Integer s:list){
    	  System.out.print(s+"  ");
      }
      System.out.println();
      for(int i  = 0 ; i < list.size() ; i ++){
    	  if(list.get(i)/10==0){
    		  list0.add(list.get(i));
    	  }else if(list.get(i)/10==1){
    		  list1.add(list.get(i));
    	  } else if(list.get(i)/10==2){
    		  list2.add(list.get(i));
    	  } else if(list.get(i)/10==3){
    		  list3.add(list.get(i));
    	  } else if(list.get(i)/10==4){
    		  list4.add(list.get(i));
    	  } else if(list.get(i)/10==5){
    		  list5.add(list.get(i));
    	  } else if(list.get(i)/10==6){
    		  list6.add(list.get(i));
    	  } else if(list.get(i)/10==7){
    		  list7.add(list.get(i));
    	  } else if(list.get(i)/10==8){
    		  list8.add(list.get(i));
    	  } else if(list.get(i)/10==9){
    		  list9.add(list.get(i));
    	  } 
      }
      map.put(0, list0);
      map.put(1, list1);
      map.put(2, list2);
      map.put(3, list3);
      map.put(4, list4);
      map.put(5, list5);
      map.put(6, list6);
      map.put(7, list7);
      map.put(8, list8);
      map.put(9, list9);
      
      System.out.println(map);
      
      
     
      
      
    }
    
    
    public static int newRandom(){
    	Random r = new Random();
    	int i = r.nextInt(100);
    	return i;
    	
    }
}
