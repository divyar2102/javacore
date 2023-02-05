package Edubridge;
import java.util.*;
public class MarkSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int marks=s.nextInt();
		
		if(marks>0 && marks<50)
		{
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("D grade");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("C grade");
		}
		else if(marks>70 && marks<80)
		{
			System.out.println("B grade");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("A grade");
		}
		else if(marks>=90 && marks<100)
		{
			System.out.println("A+");
		}
		else
		{
			System.out.println("Invalid");
		}
		System.out.println("Name: "+st+" Marks: "+marks);
	
	
	
		int n=5;
		if(n>0)			System.out.println("Positive number");
		else if(n<0)	System.out.println("Negative number");
		else			System.out.println("Zero");
		
		int a=12;
		int b=34;
		int c=8;
		if((a>b)&&(a>c))	System.out.println(a+"is greater");
		else if((b>a)&&(b>c))	System.out.println(b+"is greater");
		else 				System.out.println(c+"is greater");
	}
}
