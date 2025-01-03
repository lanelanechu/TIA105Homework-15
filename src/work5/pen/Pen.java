package work5.pen;

public abstract class Pen {
	private String brand;
	protected double price;
	
		
	public Pen() {}
	
	public Pen (String brand, double price) {
		setBrand(brand);
		setPrice(price);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void write();
;}
