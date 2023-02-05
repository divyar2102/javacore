package fundamentals;
import java.util.Scanner;
public class LargestOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		/*
		if (a>b || b>a)
		{
			System.out.println("a is greater than b");
		}
		else {
			if(b>a)
			{
				System.out.println("b is greater than a");
			}
			else
			{
				System.out.println("Both numbers are equal");
			}
		}
		*/
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("Both numbers are equal");
		}
	}

}
