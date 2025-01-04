package work5;

//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:

public class Hw2RandAvg {

	public static void main(String[] args) {

		randAvg();
	}

	static void randAvg() {

		int[] r = new int[10];
		int b = 0;

		System.out.println("本次亂數結果 : ");

		for (int a = 0; a < r.length; a++) {

			r[a] = (int) (Math.random() * 100) + 0;
			System.out.print(r[a] + " ");
			b += r[a];
			
		}

		System.out.print("\n" + (b / r.length));
	}

}
