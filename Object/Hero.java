package Object;

public class Hero extends Character {
	private String name;
	private int hp;
	private Sword sword;
	static int money;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ");
		m.hp -= 10;
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは、" + this.hp + "でした！");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		if (name.length() < 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	Hero() {
		this("シン");
	}
}
