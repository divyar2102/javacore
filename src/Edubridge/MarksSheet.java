package Edubridge;
import java.util.*;
public class MarksSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=s.nextInt();
		
		switch(marks/10) 
		{
		case 10:
			System.out.println("Grade=O");
			break;
		case 9:
			System.out.println("Grade=A");
			break;
		
		case 8:
			System.out.println("Grade=B");
			break;
			
		case 7:
			System.out.println("Grade=C");
			break;
			
		case 6:
			System.out.println("Grade=D");
			break;
		
		case 5:
			System.out.println("Grade=E");
			break;
		
			default:
				System.out.println("Fail");
				break;
		
		}

	}



}


