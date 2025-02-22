package work7;

import java.io.*;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

public class Hw4DogCat {

	public static void main(String[] args) {

		Animal c1 = new Cat("bigcat");
		Animal d1 = new Dog("bigdog");
		Animal d2 = new Dog("smalldog");
		Animal c2 = new Cat("smallcat");

		File outfile = new File("C:\\data\\Object.ser");

		FileOutputStream outputfile = null;
		ObjectOutputStream objfile = null;

		try {

			// 檢查有沒有這個目錄
			if (!outfile.exists()) new File("C:\\data\\").mkdirs();

			objfile = new ObjectOutputStream(new FileOutputStream(outfile));

			objfile.writeObject(c1);
			objfile.writeObject(d1);
			objfile.writeObject(d2);
			objfile.writeObject(c2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {

				if (objfile != null)objfile.close();
				if (outputfile != null)outputfile.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}


class Animal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Animal() {
		super();
	}

	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		
	}

	public String getName() {
		return name;
	}
	
}
