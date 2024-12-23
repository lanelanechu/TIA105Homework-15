package work1;

public class Q5 {
	public static void main (String[] args) {	
		int deposit = 1500000;
		double rate = 0.02;
		int year = 10;
		
		System.out.printf("本金加利息 = %d元", Math.round(deposit * Math.pow((1 + rate), year)));
	}
}
