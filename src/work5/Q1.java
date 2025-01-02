package work5;
/*
 * 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
 */
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入寬與高：");
		
		starSquare(s.nextInt(), s.nextInt());
		s.close();
	}
	
	public static void starSquare(int width, int height) {
		System.out.println(("*".repeat(width) + "\n").repeat(height));
	}
}
