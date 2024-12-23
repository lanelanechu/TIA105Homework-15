package work1;

public class Q6 {
	public static void main (String[] args) {
		System.out.println(5 + 5);  // 兩個數字皆為int，因此結果值為兩個數字之和
		System.out.println(5 + '5');  // 對char相加，會先將char轉換成十進制的unicode，再對這兩數相加
		System.out.println(5 + "5");   // 因爲第2個運算元為String，所以第一個運算元會先自動轉換成String，並將這兩個String串接
	}
}