package work7;

import java.io.*;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

public class Hw4DogCat {

	Cat c1 = new Cat("bigcat");
	Dog d1 = new Dog("bigdog");
	
	OutputStream outwr = new OutputStream("C:\\data\\Object.ser");

	
////	描述: 检查文件或目录是否存在
//	if(!output.exists()) {
//		output.createNewFile();
//	}
//	
	
}
