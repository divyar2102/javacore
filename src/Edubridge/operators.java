package Edubridge;
import java.util.*;
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		//unary operator
		
		
		  String st1=s.nextLine(); 
		  System.out.println(st1); 
		  String st=s.next();
		  System.out.println(st);
		 
		char ch=st.charAt(0);
		System.out.println(ch);
		
	
		int x=100; 
		System.out.println(x++);//post increment
		System.out.println(++x);//pre increment
		
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Value of a and b are:"+a+" "+b);
		int c=a+b;
		int d=a*b;
		int e=a/b;
		int f=a-b;
		
		System.out.println("Addition"+c);
		System.out.println("Multiplication"+d);
		System.out.println("Division"+e);
		System.out.println("Subtraction"+f);
		System.out.println("Enter the percentage");
		float per=s.nextFloat();
		System.out.println(per);
		
		
	}

}
