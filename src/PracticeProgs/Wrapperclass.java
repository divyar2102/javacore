package PracticeProgs;

public class Wrapperclass {
	public static void main(String args[])
	{
		int a=10;
		Integer m=Integer.valueOf(a);
		System.out.println(m);
		System.out.println(a);
		Integer b=Integer.valueOf(a);
		Integer c=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		//unboxing
		Integer x=Integer.valueOf(56);
		int y=x.intValue();
		
		int z=y;
		System.out.println(y);
		System.out.println(z);
	}

}
