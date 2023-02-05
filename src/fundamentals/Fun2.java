package fundamentals;

public class Fun2 {

	public static int do_it(int a,int b) {
		if(b==0) {
			return Integer.MIN_VALUE;
	}
		return a/b;
	}
	public static void main(String args[])
	{
		int a=10;
		int b=2;
		int res=do_it(a,b);
		System.out.println(res);
	}

}
