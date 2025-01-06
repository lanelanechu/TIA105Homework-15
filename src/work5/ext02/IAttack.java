package work5.ext02;

public interface IAttack {
	void attack();
}

class Punch implements IAttack {
	public void attack() {
		System.out.println("麵包超人拳");
	}
}

class Fire implements IAttack {
	public void attack() {
		System.out.println("火球花攻擊");
	}
}

class Lightning implements IAttack {
	public void attack() {
		System.out.println("十萬伏特");
	}
}

class Teach implements IAttack {
	public void attack() {
		System.out.println("讓你三個月內學會Java");
	}
}