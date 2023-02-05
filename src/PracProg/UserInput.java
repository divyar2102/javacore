//How to Read and Print an Integer value in Java
package PracProg;

import java.util.*;
import java.io.*;
 class UserInput{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("Number="+n);
	}
	
}