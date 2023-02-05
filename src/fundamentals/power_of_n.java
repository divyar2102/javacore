
package fundamentals;

import java.util.Scanner;

public class power_of_n 
{
	public static int powern(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
	
		int d= x*(powern(x,n-1));
		return d;
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        
        
		System.out.println(powern(a,b));

	}

}

