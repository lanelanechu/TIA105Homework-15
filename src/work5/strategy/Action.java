package work5.strategy;

public interface Action {
	void doAction();
}

class Move implements Action {
	public void doAction() {
		System.out.println("跑步");
	}
}

class Defend implements Action {
	public void doAction() {
		System.out.println("做防禦動作");
	}
}