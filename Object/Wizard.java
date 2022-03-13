package Object;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "10回復した！");
	}

	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public String getName() {
		return this.name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("wizardのMPが0以下である。処理を中断");
		}
		this.mp = mp;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("wizardの名前の値が異常です。処理を中断");
		}
		this.name = name;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("wizardの杖がnullである。処理を中断");
		}
		this.wand = wand;
	}
}
