package work7;

import java.io.EOFException;
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
		ObjectInputStream objfile = null;

		try {

			objfile = new ObjectInputStream(new FileInputStream(inFile));

			while (true) {

				try {
					
					((Animal) objfile.readObject()).speak();
					
					//如果盡頭就跳出
				} catch (EOFException e) {
					break;
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (objfile != null)
					objfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
