package day21112022;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
	public static void main(String[] args) {
		
		try{
		File f=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		f=new File("D:\\Eclipse path\\Anudip daywise codes\\src\\writefile.txt");
		fw=new FileWriter(f);
		bw=new BufferedWriter(fw);
		
		bw.write("Hello there this is mahaprabu here \n");
		bw.close();
		fw.close();
		System.out.println("File words has successfully written into the file");
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
