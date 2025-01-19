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
		
		OutputStream outstream = null;
		ObjectOutputStream objwrt = null;
		
		
		try {

			if(! outfile.exists()) {
				
				new File(outplace).mkdirs();
				outfile.createNewFile();
				
			}
			
			outstream = new FileOutputStream(outfile);
			objwrt = new ObjectOutputStream(outstream);
			objwrt.writeObject(c1);
			objwrt.writeObject(d1);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
			
		} finally {
			
			try {
				outstream.close();
				objwrt.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
