package work3;

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
