package work2;

public class No4 {

	public static void main(String[] args) {
		
		//總共多少個的變數
		int k = 0;

		for (int i = 1; i <= 49; i++) {

			//條件1:個位數為4，條件2:十位數為4
			if (i % 10 == 4 || i / 10 == 4) {

				System.out.print(i + " ");
				k++;

			}

		}

		System.out.print("\n總共有 : " + k);

	}

}
