package day21112022;

import java.io.FileReader;
import java.util.Arrays;

public class Uncheckedexception {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		
	    int len=arr.length;
	    System.out.println(Arrays.toString(arr));//this will print successfully
	    
	    System.out.println(arr[arr.length]);//ArrayIndexOutOfBoundsException
		}
	}


