package day21112022;

public class checkedexception{
	public static void main(String[]args)
	{
		
		try{
			int a=10/0;
			System.out.println(a);
		}catch(ArithmeticException e)
		{
			System.out.println("division by zero");
			e.printStackTrace();
		}
	}
}
