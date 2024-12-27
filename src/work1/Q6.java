package work1;
/*
 * 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
 * 5 + 5
 * 5 + ‘5’
 * 5 + “5”
 * 並請用註解各別說明答案的產生原因
 */
public class Q6 {
	public static void main (String[] args) {
		System.out.println(5 + 5);  // 兩個數字皆為int，因此結果值為兩個數字之和
		System.out.println(5 + '5');  // 對char相加，會先將char轉換成十進制的unicode，再對這兩數相加
		System.out.println(5 + "5");   // 因爲第2個運算元為String，所以第一個運算元會先自動轉換成String，並將這兩個String串接
	}
}