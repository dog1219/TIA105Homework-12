package work7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//
//• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)

public class Hw5DogCatspeak {

	public static void main(String[] args) {

		File inFile = new File("C:\\data\\Object.ser");
		FileInputStream inputfile = null;
		ObjectInputStream objfile = null;

		try {

			objfile = new ObjectInputStream(new FileInputStream(inFile));

			//反序列順序要一樣
			Animal c1= (Cat) objfile.readObject();
			Animal d1 = (Dog) objfile.readObject();
			
			d1.speak();
			c1.speak();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (inputfile != null)inputfile.close();
				if (objfile != null)objfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
