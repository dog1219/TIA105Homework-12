package work4;

//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class Hw1AVG {

	public static void main(String[] args) {

		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double avg;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

		}

		avg = sum / array.length;

		System.out.println("平均:" + avg);

		for (int i = 0; i < array.length; i++) {

			if (array[i] > avg) {

				System.out.print(array[i] + " ");

			}

		}

	}

}
