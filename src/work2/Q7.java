package work2;

public class Q7 {
	public static void main (String[] args) {
		int startChar = 'A';
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i + 1; j++)
				System.out.print((char) (startChar + i));
			System.out.println();
		}
	}
}
