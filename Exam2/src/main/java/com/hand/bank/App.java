package com.hand.bank;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("请输入工资:");
    	Scanner scanner = new Scanner(System.in);
    	double tax = 0;
    	double salary = scanner.nextDouble();
    	if(salary<=3500){
    		System.out.println("所需要交纳的税费为:"+tax);
    	}else if(salary>3500&&salary<=5000){
    		tax = (salary-3500)*0.03;
    		System.out.println("所需要交纳的税费为:"+tax);
    	}else if(salary>5000&&salary<=8000){
    		tax = (salary-3500)*0.03+(salary-5000)*0.1;
    		System.out.println("所需要交纳的税费为:"+tax);
    	}else if(salary>8000&&salary<=12500){
    		tax = (salary-3500)*0.03+(salary-5000)*0.1+(salary-8000)*0.2;
    		System.out.println("所需要交纳的税费为:"+tax);
    	}else if(salary>12500&&salary<=38500){
    		tax = (salary-3500)*0.03+(salary-5000)*0.1+(salary-8000)*0.2+(salary-12500)*0.25;
    		System.out.println("所需要交纳的税费为:"+tax);
    	}else if(salary>38500&&salary<=58500){
    		tax = (salary-3500)*0.03+(salary-5000)*0.1+(salary-8000)*0.2+(salary-12500)*0.25+(salary-38500)*0.3;
    		System.out.println("所需要交纳的税费为:"+tax);
    	}else if(salary>58500&&salary<=83500){
    		tax = (salary-3500)*0.03+(salary-5000)*0.1+(salary-8000)*0.2+(salary-12500)*0.25+(salary-38500)*0.3+(salary-58500)*0.35;
    		System.out.println("所需要交纳的税费为:"+tax);
    	}else if(salary>83500){
    		tax = (salary-3500)*0.03+(salary-5000)*0.1+(salary-8000)*0.2+(salary-12500)*0.25+(salary-38500)*0.3+(salary-58500)*0.35+(salary-83500)*0.45;
    		System.out.println("所需要交纳的税费为:"+tax);
    	}
    }
}
