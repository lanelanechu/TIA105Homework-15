package work5.ext02;

import java.util.ArrayList;

public class RoleGameTest {

	public static void main(String[] args) {
		ArrayList<Hero> heroes = new ArrayList<>();
		
		heroes.add(new Anpanman("麵包超人", 1, 20));
		heroes.add(new MarioBros("瑪利歐", 10, 2500));
		heroes.add(new MarioBros("路易吉", 10, 2000));
		heroes.add(new Pokemon("皮卡丘", 99, 9999));
		heroes.add(new Hero());
		
		for (Hero hero : heroes) { 
			hero.printState();
			
			hero.setIAttack();
			hero.setIMove();
			hero.setIDefend();
			
			hero.attack();
			hero.move();
			hero.defend();
			System.out.println();
		}
	}
}
