package Edubridge;
import java.util.*;
public class Marksheet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Grade");
		String st=s.next();
		char ch=st.charAt(0);
		
		
		switch(ch) 
		{
		case 'A':
			System.out.println("Grade=A");
			break;
		case 'B':
			System.out.println("Grade=B");
			break;
		
		case 'C':
			System.out.println("Grade=C");
			break;
			
		case 'D':
			System.out.println("Grade=D");
			break;
			
		case 'E':
			System.out.println("Grade=E");
			break;
		
		case 'F':
			System.out.println("Grade=F");
			break;
		
			default:
				System.out.println("Fail");
				break;
		
		}

	}



}


