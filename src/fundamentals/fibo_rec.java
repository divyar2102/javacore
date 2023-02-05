package fundamentals;

public class fibo_rec {

	public static int fibo(int n)
	{
		if(n==1 || n==2)
			return 1;
		int fib_no1=fibo(n-1);
		int fib_no2=fibo(n-2);
		int op=fib_no1+fib_no2;
		return op;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(fibo(5));
	}

	
}

