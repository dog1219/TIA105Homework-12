package work4;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」

public class Hw4Borrow {

	public static void main(String[] args) {

		int[][] money = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		System.out.print("請輸入預借金額:");
		Scanner s = new Scanner(System.in);
		int sc = s.nextInt();
		s.close();
		
		int sum = 0;

		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < money[0].length; i++) {

			if (money[1][i] >= sc) {

				System.out.print(money[0][i] + " ");
				sum++;
				
			}

		}

		System.out.print("共 "+sum+ " 人!");

	}
}
