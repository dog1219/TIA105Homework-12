package work4;

//班上有8位同學,他們進行了6次考試結果如下:

//
//請算出每位同學考最高分的次數

public class Hw6SixTest {

	public static void main(String[] args) {

		int[][] textScore = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 },
				{ 40, 77, 79, 70, 89, 100 }, { 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 },
				{ 85, 75, 70, 75, 90, 20 }, { 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };

		for (int i = 0; i <= 5; i++) {

			int k = 1;

			for (int j = 2; j <= 8; j++) {

				if (textScore[k][i] < textScore[j][i]) {

					k = j;

				}

			}

			textScore[0][k] += 1;

		}

		for (int i = 1; i < textScore[0].length; i++) {

			System.out.println("第" + i + "號同學最高分次數" + textScore[0][i]);

		}

	}

}