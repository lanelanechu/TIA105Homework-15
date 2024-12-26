package work4;

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
