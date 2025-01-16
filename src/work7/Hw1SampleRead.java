package work7;

import java.io.*;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

public class Hw1SampleRead {

	public static void main(String[] args) {
				
		try {

			File sampleFile = new File(".\\src\\work7\\Sample.txt");
			FileReader sampleReader = new FileReader(sampleFile);

			// 計算字元數跟行數
			int i;
			int samplesum = 0, sampleln = 0;
			while ((i = sampleReader.read()) != -1) {

				// 第一行不會有\n
				if (sampleln == 0) {
					sampleln += 1;
				}

				samplesum += 1;

				if ((char) i == '\n') {

					sampleln += 1;

				}

			}

			System.out.print("Sample.txt檔案共有" + sampleFile.length() + "個位元組," + samplesum + "個字元," + sampleln + "列資料");
			sampleReader.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
