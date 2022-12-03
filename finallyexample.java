package day21112022;

public class finallyexample {
	public static void main(String[]args)
	{
		try{
			int x=23/0;
			System.out.println(x);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally also executed cause it is unavoidable method");
		}
	}

}
