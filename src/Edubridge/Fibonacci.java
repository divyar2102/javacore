package Edubridge;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,count=10,i;
		a=0;
		b=1;
		
		for(i=2;i<count;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
