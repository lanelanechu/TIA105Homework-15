package work5.ext02;

public class Pokemon extends Hero {
	public Pokemon() {}
	
	public Pokemon(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void setIAttack() {
		attack = new Fire();
	}
	
	@Override
	public void setIMove() {
		move = new Run();
	}
	
	@Override
	public void setIDefend() {
		defend = new Ball();
	}
}
