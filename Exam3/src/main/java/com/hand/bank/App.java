package com.hand.bank;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.print("请输入日期(格式为yyyy-mm-dd):");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] date = s.split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		int total = 0;
		int temp_day=0;
		if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
			System.out.println("输入错误！");
		} else {
			for (int i = 1; i < month; i++) {
				switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					temp_day = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					temp_day = 30;
					break;
				case 2:
					if ((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)){
						temp_day = 29;
					} else {
						temp_day = 28;
					}
					break;
				}
				total += temp_day;
			}
			System.out.println(year + "-" + month + "-" + day + "是这年的第" + (total + day) + "天。");
		}

	}
}
