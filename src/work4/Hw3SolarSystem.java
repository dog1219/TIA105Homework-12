package work4;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

public class Hw3SolarSystem {

	public static void main(String[] args) {

		String[] solar = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int j = 0;

		for (int i = 0; i < solar.length; i++) {

			for (int c = solar[i].length() - 1; c >= 0; c--) {

				if (solar[i].charAt(c) == 'a' || solar[i].charAt(c) == 'e' || solar[i].charAt(c) == 'i'
						|| solar[i].charAt(c) == 'o' || solar[i].charAt(c) == 'u') {

					j++;

				}

			}

		}

		System.out.print("母音共有:" + j);

	}

}
