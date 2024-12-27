package work4;
/*
 * 有個字串陣列如下 (八大行星):
 * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 */
public class Q3 {
	public static void main(String[] args) {
		int counter = 0;
		
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String vowels = "aeiou";
		char[] merged = String.join("", planets).toCharArray();
		
		for (char ch : merged) {
			if (vowels.indexOf(ch) != -1)
				counter++;
		}
		
		System.out.println("共有" + counter + "個母音");
	}
}
