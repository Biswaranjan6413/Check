package Arraypatten;

public class patten {

	public static void main(String[] args) {

		int num = 5;
		for (int i = num; i >= 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print(" ");

			}
			for (int k = i; k <= num; k++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
	}

}
