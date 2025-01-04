package work5.strategy;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.attack();
		saber.startAction(new Move());
		saber.startAction(new Defend());
		
		archer.attack();
		archer.startAction(new Move());
		archer.startAction(new Defend());
	}

}
