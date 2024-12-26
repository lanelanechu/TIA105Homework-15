package work4;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入日期：");
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year, month, date;

		while (true) {
			year = s.nextInt();
			month = s.nextInt();
			date = s.nextInt();
			if (!checkYear(year))
				continue;
			
			months[1] = isLeapYear(year) ? 29 : 28;
			if (checkMonth(month) && checkDate(date, months[month - 1]))
				break;
		}
	 
		System.out.println("輸入的日期為該年的第" + calcDays(month, date, months) + "天");
		s.close();
	}
	
	public static boolean isLeapYear (int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0)
				return year % 400 == 0;
			return true;
		}
		return false;
	}
	
	public static int calcDays(int month, int date, int[] months) {
		int days = 0;
		for (int i = 0; i < month - 1; i++) {
			days += months[i];
		}
		return days + date; 
	}
	
	public static boolean checkYear(int year) {
		if (year <= 0) {
			System.out.println("輸入之年份不是正整數");
			return false;			
		}
		return true;
	}
	
	public static boolean checkMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("輸入之月份未在合理範圍 (1~12)");
			return false;
		}
		return true;
	}
	
	public static boolean checkDate(int date, int daysOfMonth) {
		if (date < 1 || date > daysOfMonth) {
			System.out.println("輸入之日期未在合理範圍 (1~" + daysOfMonth + ")");
			return false;			
		}
		return true;
	}
}
