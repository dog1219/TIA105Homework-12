package work3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		System.out.println("阿文...請輸入你討厭哪個數字?");
		int sc = scan();	//輸入並判定1~9

		int[] k = new int[49];
		int sum = 0;

		for (int a = 1; a <= k.length; a++) {

			if (a % 10 != sc && a / 10 != sc) {

				k[sum++] = a;

			}

		}

		for (int a = 0; a < sum;) {

			for (int c = 0; c < 6 && a < sum; c++) {

				System.out.print(k[a] + "\t");

				a = a + 1;
			}

			System.out.println();

		}

		System.out.print("總共有" + sum + "數字可選");

		System.out.println("\n============================");
		// (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		int[] j = new int[6];
		int b = 0;
		// 產生六個亂數
		for (int a = 0; a < 6; a++) {
			
			j[a] = (int) (Math.random() * 49) + 1;
			
			// 內部比對有沒有重複
			all: 
			while (true) {
				
				if (j[a] % 10 != sc && j[a] / 10 != sc) {

					if (a == 0) {

						break all;

					}

					for (b = 0; b < a;) {

						if (j[a] == j[b]) {

							j[a] = (int) (Math.random() * 49) + 1;
							b = 0;

						} else {

							b++;

							if (a == b) {
								
								break all;
								
							}

						}

					}

				} else {

					j[a] = (int) (Math.random() * 49) + 1;

				}

			}

			System.out.print(j[a] + " ");

		}		

	}
	
	//判定輸入的是1~9
	static int scan() {
		
		Scanner s = new Scanner(System.in);
		int sc = s.nextInt();
		
		while (sc < 1 || sc > 9) {
			
			System.out.println("請輸入1~9之間的數字");
			sc = s.nextInt();
			
		}
		s.close();
		return sc;
		
	}	

}
