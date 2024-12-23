package work3;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入3個整數：");
		int edge1 = s.nextInt();
		int edge2 = s.nextInt();
		int edge3 = s.nextInt();
		s.close();
		
		System.out.println(checkTriangle(edge1, edge2, edge3));
	}
	
	public static String checkTriangle(int e1, int e2, int e3) {
		if (e1 + e2 <= e3 || e1 + e3 <= e2 || e2 + e3 <= e1)
			return "不是三角形";
		if (e1 == e2 && e2 == e3)
			return "正三角形";
		if (e1 == e2 || e2 == e3 || e1 == e3)
			return "等腰三角形";
		if (e1 * e1 + e2 * e2 == e3 * e3 || e1 * e1 + e3 * e3 == e2 * e2 || e2 * e2 + e3 * e3 == e1 * e1)
			return "直角三角形";
		return "其他三角形";
	}	
}
