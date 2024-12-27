package work3;
/*
 * 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
 * 對則顯示正確訊息
 * (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
 */

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int target = (int) (Math.random() * 101);
		int guess;
		
		Scanner s = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		
		while (true) {
			guess = s.nextInt();
			if (guess == target) {
				System.out.println("答對了！答案就是" + target);
				break;
			} else if (guess < target) {
				System.out.println("太小");
			} else {
				System.out.println("太大");
			}
		}
		s.close();
	}
}
