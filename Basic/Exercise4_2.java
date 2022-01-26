public class Exercise4_2 {
	public static void main(String[] args) {
		int[] moneylist = { 121902, 8302, 55100 };
		for (int i = 0; i < moneylist.length; i++) {
			System.out.println(moneylist[i]);
		}

		for(int money: moneylist) {
			System.out.println(money);
		}
	}
}
