package work5.q4;
/*
 * 請設計一個類別MyRectangle:
 */
public class MyRectangle {
	// 有兩個double型態的屬性為width, depth
	private double width;
	private double depth;
	
	// 有三個方法
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width * depth;
	}
	
	// 有兩個建構子
	public MyRectangle() {};
	
	public MyRectangle(double width, double depth) {
		setWidth(width);
		setDepth(depth);
	}
}
