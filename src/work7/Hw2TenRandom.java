package work7;

import java.io.*;

//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)

public class Hw2TenRandom {

	public static void main(String[] args) {

		try {

			PrintWriter pw = new PrintWriter(new FileWriter(".\\src\\work7\\Data.txt"));

			for (int i = 1; i <= 10; i++) {

				pw.print( (int) (Math.random() * 1000) + 1 + ",");

			}

			pw.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
