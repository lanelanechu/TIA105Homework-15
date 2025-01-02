package work5;
/*
 * 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
 * 可以找出二維陣列的最大值並回傳,如圖:
 */
public class Q3 {
	public static void main(String[] args) {
		int[][] intArray = {{1, 6, 3}, {9, 5, 0, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 8.2}, {-9,5, 9.3, -3,2}, {}};
		Q3 q = new Q3();
		System.out.println(q.maxElement(intArray));
		System.out.println(q.maxElement(doubleArray));
	}
	
	public int maxElement(int x[][]) {
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				res = Math.max(res, x[i][j]);
		}
		return res;
	}
	
	public double maxElement(double x[][]) {
		double res = Double.MIN_VALUE;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				res = Math.max(res, x[i][j]);
		}
		return res;
	}
}
