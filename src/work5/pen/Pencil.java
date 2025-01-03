package work5.pen;

public class Pencil extends Pen {	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	public Pencil() {};
	
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	@Override
	public double getPrice() {
		return price * 0.8;
	}
}

