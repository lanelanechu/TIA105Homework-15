package work5.ext02;

public class Anpanman extends Hero {
	public Anpanman() {}
	
	public Anpanman(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void setIAttack() {
		attack = new Punch();
	}
	
	@Override
	public void setIMove() {
		move = new Fly();
	}
	
	@Override
	public void setIDefend() {
		defend = new Bread();
	}
}
