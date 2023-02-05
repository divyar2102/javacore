package Edubridge;
import java.util.*;
public class SumofNum {
	public static void main(String[] args) {
		
	
	int n=123;
	int i=1;
	int rem;

	int sum=0;
	while(i>0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		i++;
		
	}
	System.out.println(sum);
	
	}
}