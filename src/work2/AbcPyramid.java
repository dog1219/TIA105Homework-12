package work2;

public class AbcPyramid {

	public static void main(String[] args) {

		for (int j = 'A'; j <= 'F'; j++) {

			for (int i = 1; i <= (j - 64); i++) {

				System.out.print((char) j);

			}

			System.out.println();

		}

	}

}