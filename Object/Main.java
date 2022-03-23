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

		//static 静的メンバ
		Hero.money = 100;
		System.out.println("勇者たちの所持金は、" + Hero.money + "円になった");
		System.out.println("勇者のHPは、" + h.getHp() + "になった");

		//多態性
		Character chara = wizard;
		Matango m = new Matango('A');
		chara.name = "アサカ";
		chara.attack(m);

		Slime slime = new Slime();
		Monster monster = new Slime();
		slime.run();
		monster.run();

		//多態性 捉え方の変更
		//		Character c = new Wizard();
		if (chara instanceof Wizard) {
			Wizard w = (Wizard) chara;
			System.out.println("wizardにキャストしました");
			w.fireball(m);
		}

		//多態性 配列利用
		Character[] arrayChara = new Character[3];
		arrayChara[0] = new Hero("ヒナタ");
		arrayChara[1] = new Hero();
		arrayChara[2] = new Wizard();
		for (Character cha : arrayChara) {
			cha.attack(m);
		}
	}

}
