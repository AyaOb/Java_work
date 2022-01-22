public class Exercise3_2 {
	public static void main(String[] args) {
		System.out.println("[メニュー]１:検索２:登録３:削除４:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
	}
}
