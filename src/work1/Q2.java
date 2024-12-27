package work1;
/*
 * 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
 */

public class Q2 {
	public static void main (String[] args) {
		System.out.printf("%d打%d顆", 200 / 12, 200 % 12);
	}
}
