package fundamentals;
import java.util.Scanner;
public class DataTypesStorage {
	public static void main(String args[])
	{
		/*
		int a = Integer.MIN_VALUE;
		int b= Integer.MAX_VALUE;
		System.out.println(a+" "+b);*/
		/*
		char ch = 'a';
		int i ='a';
		System.out.println('a'+3);
		System.out.println(i);
		
		Scanner s = new Scanner(System.in);
		String str;
		str = s.next();
		System.out.print(str);*/
		
		/*
		  int a=50;
		    int b=Integer.MIN_VALUE;
		    if(a/0==b)
		    {

		        System.out.println("Hello");
		    }
		    else
		    {
		        System.out.println("Hi");
		    }*/
		int a=50,b=20;
	    if(a>b)
	    {
	        if(a>100)
	            System.out.println("Ace");
	        if(b<100)
	            b=50;
	    }
	    else if(a==b)
	    {
	        System.out.println("King");
	    }
	    else 
	    {
	        System.out.println("Queen");
	    }
	}

}
