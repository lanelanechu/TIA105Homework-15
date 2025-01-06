package work5.ext01;

public class Main {
	public static void main(String[] args) {
		Pen[] test = new Pen[6];
		
		test[0] = new InkBrush("InkBrushA", 30);
		test[1] = new InkBrush("InkBrushB", 50);
		test[2] = new Pencil("PencilA", 30);
		test[3] = new Pencil("PencilB", 50);
		
		test[4] = new InkBrush();
		test[4].setBrand("InkBrushC");
		test[4].setPrice(100);
		
		test[5] = new Pencil();
		test[5].setBrand("PencilC");
		test[5].setPrice(100);
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i].getBrand() + "的售價為：$" + test[i].getPrice());
			test[i].write();
		}
		
		
	}
}
