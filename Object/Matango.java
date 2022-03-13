package Object;

public class Matango {
	int hp;
	private char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}
}
