package day21112022;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenotfoundexception {
	public static void main(String[] args) {
		String path="D:\\Eclipse path\\filenotfound.txt"; //  file is exist
	//	String path="D:\\Eclipse path\\filenotound.txt";    file is not exist
		try{
			FileReader file=new FileReader(path);
			System.out.println("file is exist");
		}catch(FileNotFoundException e)
		{
			System.out.println("File is not exist");
			e.printStackTrace();
		}
	}

}
