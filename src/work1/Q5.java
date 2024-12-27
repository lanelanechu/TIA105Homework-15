package work1;
/*
 * 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
 * 金加利息共有多少錢 (用複利計算,公式請自行google)
 */
public class Q5 {
	public static void main (String[] args) {	
		int deposit = 1500000;
		double rate = 0.02;
		int year = 10;
		
		System.out.printf("本金加利息 = %d元", Math.round(deposit * Math.pow((1 + rate), year)));
	}
}
