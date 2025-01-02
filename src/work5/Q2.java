package work5;
/*
 * 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
 */
public class Q2 {
	public static void main(String[] args) {
		System.out.println("本次亂數結果：");
		randAvg();
	}
	
	public static void randAvg() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int rand = (int) (Math.random() * 101);
			System.out.print(rand + " ");
			sum += rand;
		}
		
		System.out.println("\n" + sum / 10);
	}
}
