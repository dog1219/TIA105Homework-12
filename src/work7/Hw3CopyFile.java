package work7;

import java.io.*;

//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

public class Hw3CopyFile {

	public static void main(String[] args) {

		String inputFile = ".\\src\\work7\\Hw3CopyFileIn.txt";
		String outputFile = ".\\src\\work7\\Hw3CopyFileOut.txt";

		copyFile(inputFile, outputFile);

	}

	static void copyFile(String inputFile, String outputFile) {

		try {

			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);
			
			int i;
			while ((i = in.read()) != -1) {

				out.write(i);

			}

			in.close();
			out.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}
