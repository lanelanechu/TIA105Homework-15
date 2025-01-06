package work5.ext02;

public class Pokemon extends Hero {
	public Pokemon() {}
	
	public Pokemon(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void setIAttack() {
		attack = new Lightning();
	}
	
	@Override
	public void setIMove() {
		move = new Crawl();
	}
	
	@Override
	public void setIDefend() {
		defend = new Ball();
	}
}
