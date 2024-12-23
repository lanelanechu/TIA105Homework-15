package work2;

public class Q3 {
	public static void main (String[] args) {
		int result = 1;
		int i = 1;
		while (i <= 10) {
			result *= i;
			i++;
		}
		System.out.println("1~10之連乘積 = " + result);
	}
}
