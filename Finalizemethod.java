package day21112022;

public class Finalizemethod {
	public static void main(String[] args) {
	Finalizemethod f=new Finalizemethod();
	System.out.println("Hashcode :"+f.hashCode());
	f=null;
	System.gc();
	System.out.println("End of garpage collector");
	}
	@Override
	protected void finalize()
	{
		System.out.println("Fianlize method called");
	}
	
	}

