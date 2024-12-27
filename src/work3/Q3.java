package work3;
/*
 * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
 * 的號碼與總數
 */

import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		
		while (true) {
			int dislikedNumber = s.nextInt();
			if (dislikedNumber >= 1 && dislikedNumber <= 9) {
				checkDislikedNumber(dislikedNumber);
				break;
			}
			System.out.println("未輸入合理範圍");
		}	
		s.close();
	}
	
	public static void checkDislikedNumber(int num) {
		int[] arr = new int[49];
		int count = 0;
		
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != num && i / 10 != num) {
				arr[count] = i;
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("總共有" + count + "個數字可選");
		printUniqueNumbers(arr, count);
	}
	
	// (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	public static void printUniqueNumbers(int[] arr, int count) {
		System.out.print("隨機6個數：");
		int[] result = new int[6];
		int ptr = 0;
		
		outer:
		while (ptr < 6) {
			int randomNumber = arr[(int) (Math.random() * count)];
			for (int i = 0; i < ptr; i++) {
				if (result[i] == randomNumber)
					continue outer;
			}
			System.out.print(randomNumber + " ");
			result[ptr] = randomNumber;
			ptr++;
		}
	}
}
