package work2;

public class Q1 {
	public static void main (String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			if (i % 2 == 0) sum += i;
		System.out.println("1~1000之偶數和 = " + sum);
	}
}
