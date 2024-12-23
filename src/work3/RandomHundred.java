package work3;

import java.util.Scanner;

//這是一隻猜數字的程式，內含1~100跟1~9兩個
public class RandomHundred {

	public static void main(String[] args) {

		//1~100顯示大於小於答案
		System.out.println("開始猜數字吧!");

		int i = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			int j = sc.nextInt();

			if (i == j) {

				System.out.println("答對了!答案就是" + i);
				break;

			} else if(i < j){
				
				System.out.println("大於正確答案");
				
			}else if (i > j) {
				
				
				System.out.println("小於正確答案");
				
			}

		}
		
		//猜0~9
		System.out.println("==================================");
		int i1 = (int) (Math.random() * 9);
		System.out.println("開始猜數字吧!" );
		Scanner sc1 = new Scanner(System.in);
		
		while (true) {
			
			int j1 = sc1.nextInt();

			if (i1 == j1) {

				System.out.println("答對了!答案就是" + i1);
				sc1.close();
				sc.close();
				break;

			} else{
				
				System.out.println("猜錯囉");
				
			}

		}
		

	}

}
