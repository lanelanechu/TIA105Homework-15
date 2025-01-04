package work5.strategy;

public abstract class Hero {
	// 省略 getter/setter...
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public abstract void attack();
	
	public void startAction(Action action) {
		action.doAction();
	}
}
