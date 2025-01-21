package work7;

import java.io.*;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

public class Hw1SampleRead {

	public static void main(String[] args) {

		File sampleFile = new File(".\\src\\work7\\Sample.txt");
		FileReader sampleReader = null;
		BufferedReader bf = null;
		
		try {

			sampleReader = new FileReader(sampleFile);
			bf = new BufferedReader(sampleReader);

			String i;
			int samplesum = 0, sampleln = 0;

			while ((i = bf.readLine()) != null) {

				sampleln += 1;
				samplesum += i.length();

			}

			// 第一行沒被計算到，第一行\n 有兩行，只要有字就是有第一行
			if (samplesum != 0) {
				sampleln += 1;
			}

			System.out.print("Sample.txt檔案共有" + sampleFile.length() + "個位元組," + samplesum + "個字元," + sampleln + "列資料");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(sampleReader!= null)sampleReader.close();
				if(bf!= null) bf.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}

	}

}