package work7;

import java.io.*;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

public class Hw4DogCat {

	public static void main(String[] args) {

		Cat c1 = new Cat("bigcat");
		Dog d1 = new Dog("bigdog");
		
		String outplace = "C:\\data\\";	
		File outfile = new File("C:\\data\\Object.ser");
		
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
		
		
		try {

			if(! outfile.exists()) {
				
				new File(outplace).mkdirs();
				outfile.createNewFile();
				
			}
			
			fileWriter = new FileOutputStream(outfile);


		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
			
		} finally {
			
			try {
				outstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
