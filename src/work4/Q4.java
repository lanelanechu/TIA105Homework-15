package work4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int[][] data = {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入想要借多少錢");
		checkLending(s.nextInt(), data);
		s.close();
	}
	
	public static void checkLending(int money, int[][] data) {
		int count = 0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i][1] >= money) {
				count++;
				if (count == 1)
					System.out.print("有錢可借的員工編號：");
				System.out.print(data[i][0] + " ");
			}
		}
		
		System.out.println(count != 0 ? "共" + count + "人！" : "沒有人可以借你錢");
	}
}
