package work5.ext02;

public interface IAttack {
	void actAttack();
}

class Punch implements IAttack {
	public void actAttack() {
		System.out.println("麵包超人拳");
	}
}

class Fire implements IAttack {
	public void actAttack() {
		System.out.println("火球攻擊");
	}
}

class Teach implements IAttack {
	public void actAttack() {
		System.out.println("讓你三個月內學會Java");
	}
}