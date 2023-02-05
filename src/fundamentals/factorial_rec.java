package fundamentals;

public class factorial_rec {
	public static int facto(int n)
	{
		if(n==0) {
			return 1;
		}
		int s=facto(n-1);
		int op=n*s;
		return op;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(facto(5));
	}

}
