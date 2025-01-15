package work4;

import java.util.Scanner;

//• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

public class Hw5Date {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("請輸入西元年(yyyy):");
		int year = s.nextInt();
		int leepyear = leapyearcheck(year);
		System.out.print("請輸入月(mm):");
		int month = monthcheck(s.nextInt());
		System.out.print("請輸入日(dd):");
		int day = daycheck(leepyear, month, s.nextInt());
		int longday = daySum(leepyear, month, day);
		System.out.print("輸入的日期為該年第" + longday + "天");
	}

	// 閏年確認
	public static int leapyearcheck(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {

			year = 1;

		} else {

			year = 0;

		}
		return year;

	}

	// 確認輸入的月份在1~12之間
	public static int monthcheck(int month) {

		while (month > 12 || month < 1) {
			System.out.println("這是月份，請輸入1~12整數");
			System.out.print("請輸入月(mm):");
			month = s.nextInt();
		}

		return month;

	}

	// 確認輸入的日期在該月範圍內
	public static int daycheck(int leapyear, int month, int day) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

			while (day > 31 || day < 1) {

				System.out.println("這是" + month + "月份，請輸入1~31整數");
				System.out.print("請輸入日(dd):");
				day = s.nextInt();

			}

		} else if (month == 4 || month == 6 || month == 9 || month == 11) {

			while (day > 30 || day < 1) {

				System.out.println("這是" + month + "月份，請輸入1~30整數");
				System.out.print("請輸入日(dd):");
				day = s.nextInt();

			}

		} else if (month == 2) {

			if (leapyear == 1) {

				while (day > 29 || day < 1) {

					System.out.println("這是" + month + "月份，請輸入1~29整數");
					System.out.print("請輸入日(dd):");
					day = s.nextInt();

				}

			} else {

				while (day > 28 || day < 1) {

					System.out.println("這是" + month + "月份，請輸入1~28整數");
					System.out.print("請輸入日(dd):");
					day = s.nextInt();

				}

			}

		}

		return day;

	}

	// 輸入的日期為該年第幾天
	public static int daySum(int leapyear, int month, int day) {

		int[] monthday = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };

		int longday = 0;

		if (month <= 2) {

			leapyear = 0;

		}

		for (int a = 0; a <= month - 1; a++) {

			longday += monthday[a];

		}

		longday += day + leapyear;
		return longday;

	}

}
