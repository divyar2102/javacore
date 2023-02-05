package Edubridge;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev,sum;
		int n=123;
		rev=0;
		int i=1;
		sum=0;
		while(i>0)
		{
			rev=n%10;
			sum=sum+(rev*10);
			i++;
		}
		System.out.println(rev);
		
	}
}

