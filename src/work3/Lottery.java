package work3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		System.out.println("阿文...請輸入你討厭哪個數字?");
		int sc = scan();// 判定輸入的是1~9
		int[] sum = array(sc);// 計算過濾掉討厭的並存在陣列裡
		printarray(sum);// 列印陣列六個一行
		System.out.println("\n============================");
		random(sc);// 亂數六個而且不重複
	}

	// 判定輸入的是1~9
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

	// 計算過濾掉討厭的並存在陣列裡
	static int[] array(int sc) {

		int x = 49;
		// 計算數量
		int sum = 0;

		for (int a = 1; a <= x; a++) {

			if (a % 10 != sc && a / 10 != sc) {

				sum++;

			}

		}

		// 存在陣列
		int[] k = new int[sum];

		for (int a = 1, b = 0; a <= x; a++) {

			if (a % 10 != sc && a / 10 != sc) {

				k[b++] = a;

			}

		}

		return k;
	}

	// 列印出過濾過的數字，六個一排
	static void printarray(int[] sum) {

		for (int a = 0, b = 1; a < sum.length; a++, b++) {

			System.out.print(sum[a] + "\t");

			if (b % 6 == 0) {

				System.out.println();

			}

		}

		System.out.print("\n總共有" + sum.length + "數字可選");

	}

	// 亂數生成六個
	static void random(int sc) {

		int[] r = new int[6];

		for (int a = 0; a < 6; a++) {

			r[a] = (int) (Math.random() * 49) + 1;

			again: while (true) {

				// 第一關是不是討厭的數
				if (r[a] % 10 == sc || r[a] / 10 == sc) {

					r[a] = (int) (Math.random() * 49) + 1;
					continue;

					// 如果是第一個數，過了第一關也沒有其他數可以比對
				} else if (a == 0) {

					break;

				} else {

					// 內部比對程式碼，重複就重新產生然後再來比對一次
					for (int i = 0; i < a; i++) {

						if (r[a] == r[i]) {

							r[a] = (int) (Math.random() * 49) + 1;
							continue again;

						}

					}

					break;

				}

			}

			System.out.print(r[a] + " ");

		}

	}

}
