package fundamentals;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*
		int n = s.nextInt();
		int div = 2;
		boolean isPrime = true;
		while(div<=n/2)
		{
			if (n%div==0)
			{
				isPrime = false;
			}
			div = div+1;
		}
		if (isPrime)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Composite number");
		}
	}*/
		int n=s.nextInt();
	    boolean isprime=true;
	    if(n%2==0)
	        isprime=false;
	    int i=3;
	    while(isprime&&i<n)
	    {
	        isprime=!(n%i==0);
	        i+=2;
	    }
	    if(isprime)
	    {
	        System.out.println("Prime");
	    }
	    else
	    {
	        System.out.println("Composite");
	    }
		
	}

}
