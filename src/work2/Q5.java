package work2;

public class Q5 {
	public static void main (String[] args) {
		System.out.print("可以選擇的數字有：");
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i / 10 != 4) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n共" + count + "個");	
	}
}
