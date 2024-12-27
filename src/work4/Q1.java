package work4;
/*
 * 有個一維陣列如下:
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 */
public class Q1 {
	public static void main(String[] args) {
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		double avg = calcAvg(arr);
		System.out.println("平均值：" + avg); 
		printMoreThanAvg(arr, avg);
	}
	
	public static double calcAvg(int[] arr) {
		int sum = 0;
		for (int num : arr)
			sum += num;
		return sum / arr.length;
	}
	
	public static void printMoreThanAvg(int[] arr, double avg) {
		System.out.print("大於平均值的元素：");
		for (int num : arr) {
			if (num > avg)
				System.out.print(num + " ");
		}
	}
}
