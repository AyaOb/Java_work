package Object;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		System.out.println("勇者" + h.getName() + "を生み出した！");

		Wizard wizard = new Wizard();

		Wand wand = new Wand();
		wizard.setWand(wand);

		wizard.heal(h);

		//		Cleric c = new Cleric("カミュ", 100, 50);
		//		System.out.println("聖職者" + c.name + "のHPは" + c.hp + "、MPは" + c.mp);
		//
		//		Matango m1 = new Matango();
		//		m1.hp = 50;
		//		m1.suffix = 'A';
		//
		//		Matango m2 = new Matango();
		//		m2.hp = 48;
		//		m2.suffix = 'B';
		//
		//		h.slip();
		//		m1.run();
		//		m2.run();

		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);

		Hero.money = 100;
		System.out.println("勇者たちの所持金は、" + Hero.money + "円になった");
		System.out.println("勇者のHPは、" + h.getHp() + "になった");
	}

}
