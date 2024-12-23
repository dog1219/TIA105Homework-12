package work3;

import java.util.Arrays;
import java.util.Scanner;

// 三角形判斷
public class Triangle {

	public static void main(String[] args) {

		System.out.println("請輸入三個整數 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		
		int[] k = { x, y, z };
		Arrays.sort(k);
//		 若 a + b ≦ c ，三線段無法構成三角形
//		 若 a × a + b × b < c × c ，三線段構成鈍角三角形 (Obtuse triangle)
//		 若 a × a + b × b = c × c ，三線段構成直角三角形 (Right triangle)
//		 若 a × a + b × b > c × c ，三線段構成銳角三角形 (Acute triangle)

		// 判斷三角形 最短的兩邊和>第三邊
		if (k[0] + k[1] > k[2]) {

			// 正三角形 三個數相等
			if (k[0] == k[1] && k[1] == k[2]) {

				System.out.print("正三角形");

				// 等腰三角形 任意兩個數相等
			} else if (k[0] == k[1] || k[1] == k[2]) {

				System.out.print("等腰三角形");

				// 直角三角形 若三角形滿足一邊長的平方等於另兩邊長的平方和
			} else if (k[2] * k[2] == (k[0] * k[0] + k[1] * k[1])) {

				System.out.print("直角三角形");

			} else {

				System.out.print("其他三角形");

			}

		} else {

			System.out.print("不是三角形");

		}

	}

}
