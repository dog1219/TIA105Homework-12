package work5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

public class Hw1StarSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入寬與高 : ");
		int width = sc.nextInt();
		int height = sc.nextInt();
		sc.close();
		
		starSquare(width, height);

	}

	static void starSquare(int width, int height) {

		for (int j = 1; j <= height; j++) {
			
			for (int i = 1; i <= width; i++)
				
				System.out.print("*");
			
			System.out.println("");
			
		}
	}

}
