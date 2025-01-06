package work5.ext02;

public class Hero {	
	private String name;
	private int level;
	private double exp;
	
	protected IAttack attack;
	protected IMove move;
	protected IDefend defend;

	public Hero() {
		this("小吳老師", Integer.MAX_VALUE, Double.MAX_VALUE);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void printState() {
		System.out.println(name + "  等級：" + level + "  經驗值：" + exp);
	}
	
	public void setIAttack() {
		attack = new Teach();
	};
	
	public void setIMove() {
		move = new Walk();
	};
	
	public void setIDefend() {
		defend = new Unknown();
	}
	
	public void attack() {
		System.out.print("攻擊方式：");
		attack.attack();
	}

	public void move() {
		System.out.print("移動方式：");
		move.move();
	}

	public void defend() {
		System.out.print("防禦方式：");
		defend.defend();
	}
		

}
