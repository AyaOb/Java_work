package Object;

public class PoisonMatango extends Matango {
	private int poisonCount = 5;

	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int hitPoint = h.getHp() / 5;
			h.setHp(h.getHp() - hitPoint);
			System.out.println(hitPoint + "ポイントのダメージ");
			this.poisonCount--;
		}
	}

	public PoisonMatango(char suffix) {
		super(suffix);
	}

}
