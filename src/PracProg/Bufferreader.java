package PracProg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader {
	public static void main(String args[]) 
		
		throws IOException
		{
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		
		String nm= b.readLine();
		
		System.out.println(nm);
	}
	
	
}
