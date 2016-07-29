package com.hand.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
       int count = 0 ;
       boolean flag = false;
       List<Integer> list = new ArrayList<Integer>();
       for(int i = 101 ; i < 200 ; i +=2){
    	   for( int j = 2 ; j <= Math.sqrt(i) ; j ++){
    		   if(i%j == 0 ){
    			   flag = false;
    			   break;
    		   }else{
    			   flag = true;
    			   
    		   }
    	   }
    	   if(flag==true){
    		   count++;
    		   list.add(i);
    	   }
       }
       System.out.print("总共有 "+count+" 个素数,分别为  ");
       for(Integer s:list){
    	   System.out.print(s+ "  ");
       }
    	
    }
}
