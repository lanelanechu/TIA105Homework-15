package work1;
/*
 * 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
 */
public class Q4 {
	public static void main (String[] args) {
		final double PI = 3.1415;
		int radius = 5;
		
		System.out.printf("圓面積 = %.2f%n", radius * radius * PI);
		System.out.printf("圓周長 = %.2f%n", radius * 2 * PI);
	}
}
