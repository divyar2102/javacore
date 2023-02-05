package PracProg;
import java.util.Scanner;
//Java Program to Swap Two Numbers
import java.util.Scanner.*;
public class SwapNumbers {

	public static void main(String args[]) {
		int a,b;
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before:"+a);
		System.out.println("Before:"+b);
		
//		/
//		//using third variable
//		
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("After:"+a);
//		System.out.println("After:"+b);
//		
		//using other aspect
		 a=a+b;
		b=a-b;
		a=a-b;
		

		System.out.println("After:"+a);
		System.out.println("After:"+b);
		
		
		
	}
}
