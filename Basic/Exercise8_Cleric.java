public class Exercise8_Cleric {
	final int MAXHP = 50;
	final int MAXMP = 10;
	String name;
	int hp = 50;
	int mp = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");

		this.mp -= 5;
		this.hp = this.MAXHP;

		System.out.println(this.name + "のHPが全快した");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒、祈るを唱えた");

		int recover = sec + new java.util.Random().nextInt(3);
		this.mp += recover;
		if (this.mp >= this.MAXMP) {
			this.mp = this.MAXMP;
			recover = this.MAXMP - this.mp;
		}

		System.out.println(this.name + "のMPは" + recover + "ポイント回復した");
		return recover;
	}
}
