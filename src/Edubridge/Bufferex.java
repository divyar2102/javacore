package Edubridge;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bufferex {

	public static void main(String[] args) throws IOException {
		/*
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String nm=br.readLine();
		System.out.println(nm);
		int a=Integer.parseInt(br.readLine());
		System.out.println("name is"+a);
		
		int x=Integer.parseInt()*/
		
		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two numbers");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		int c=a+b;
		System.out.println(c);
		
		
		
				
	}
	

}
