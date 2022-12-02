package day21112022;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedexception2 {
	public static void main(String[] args) {
		String filepath="D:\\Eclipse path\\Anudip daywise codes\\src\\testfile.txt";
		try{
			FileReader file=new FileReader(filepath);
			System.out.println("This file is exist");
		}catch(FileNotFoundException e)
		{
			System.out.println("This file is not exist");
			e.printStackTrace();
		}
		
	}

}
