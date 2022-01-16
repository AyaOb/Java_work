public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			int result = number * number;
			System.out.println(result);
			number++;
		}

		int array[] = { 11, 12, 13, 14 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int element : array) {
			if (element % 2 == 0) {
				continue;
			} else {
				System.out.println(element);
			}
		}

	}
}
