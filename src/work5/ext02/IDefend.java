package work5.ext02;

public interface IDefend {
	void actDefend();
}

class Bread implements IDefend {
	public void actDefend() {
		System.out.println("呼叫咖哩麵包超人");
	}
}

class Mushroom implements IDefend {
	public void actDefend() {
		System.out.println("吃超級蘑菇");
	}
}

class Ball implements IDefend {
	public void actDefend() {
		System.out.println("回寶可夢球");
	}
}

class Unknown implements IDefend {
	public void actDefend() {
		System.out.println("還在想");
	}
}
