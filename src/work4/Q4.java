package work4;
/*
 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
 * 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
 * 員工編號: 25 19 27 共 3 人!」
 */
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
