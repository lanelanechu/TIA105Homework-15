package work5.q4;
/*
 * 請另外建立一個MyRectangleMain類別,此類別只有main方法
 */
public class MyRectangleMain {
	public static void main(String[] args) {
		// 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
		MyRectangle case1 = new MyRectangle();
		case1.setWidth(10);
		case1.setDepth(20);
		System.out.println("面積：" + case1.getArea());
		
		// 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
		MyRectangle case2 = new MyRectangle(10, 20);
		System.out.println("面積：" + case2.getArea());
		
	}
}
