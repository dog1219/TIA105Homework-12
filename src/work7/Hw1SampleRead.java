package work7;

import java.io.*;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

public class Hw1SampleRead {

	public static void main(String[] args) {
       

        try {
        	
            FileReader reader = new FileReader(".\\src\\work7\\Sample.txt");
            int charsum = 0;
            while (reader.read() != -1) {
            	
            	charsum += 1;
            	
            }

            System.out.println("Sample.txt檔案共有"+"個位元組," + charsum + "個字元,"  + "列資料");
        	reader.close();
        	
        } catch (IOException e) {
        	
            e.printStackTrace();
            
        }

	}

}
