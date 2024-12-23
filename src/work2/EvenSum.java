package work2;

public class EvenSum {

	public static void main(String[] args) {

		int j = 0;

		for (int i = 1; i <= 1000; i++) {

			if (i % 2 == 0) {

				j = j + i;

			}

		}

		System.out.print("1~1000的偶數和 : " + j);

	}

}
