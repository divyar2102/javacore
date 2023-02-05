package fundamentals;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
	 int a=10;
	 int b=20;
	 int c=a+b;
	System.out.print(c);
	
	//integer input from user
	/*
	int i,j;
	Scanner s = new Scanner(System.in);
	i=s.nextInt();
	j=s.nextInt();
	int cc=i+j;
	System.out.print(cc);*/
	
	// float input from user
	float i,j;
	Scanner s = new Scanner(System.in);
	i=s.nextFloat();
	j=s.nextFloat();
	//float cc=i+j;
	System.out.print(i+j);
	
	//String
	/*
	String str=s.nextLine();
	System.out.print(str); */
	//character

	String st=s.next();
	char ch=st.charAt(0);
	System.out.print(ch);
	
	
	
	
	
	
	/*
	 int 4 byte
	 short 2 byte
	 long 8 byte
	 byte 1 byte
	 */
	}

}
