package work5.ext02;

public interface IMove {
	void actMove();
}

class Fly implements IMove {
	public void actMove() {
		System.out.println("飛");
	}
}

class Run implements IMove {
	public void actMove() {
		System.out.println("跑");
	}
}

class Crawl implements IMove {
	public void actMove() {
		System.out.println("爬");
	}
}

class Walk implements IMove {
	public void actMove() {
		System.out.println("走路");
	}
}
