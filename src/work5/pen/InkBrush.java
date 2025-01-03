package work5.pen;

public class InkBrush extends Pen {
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public InkBrush() {};
	
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	@Override
	public double getPrice() {
		return price * 0.9;
	}
}
