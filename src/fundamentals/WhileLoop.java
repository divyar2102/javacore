package fundamentals;

import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		//int n = s.nextInt();
		int i =0;
		
		while(i<10)
		{
			i=i+1; //i=1 i=2 hello i=3 i=4 h i=5 
		
			System.out.println(i);
			i=i+1;
		}
		/*
		Question 2 :
		if you comment the inc of i then will go to infinite loop
		while(i<=n)
		{
			System.out.println("Hello");
			//i=i+1;
		}
		
		Question 3 : this is called as empty body by just putting ; after while 
		no ouput is displayed
		while(i<=n);
		{
			System.out.println("Hello");
			i=i+1;
		}
	
	 infinite loop ahe ans
	    int x=5;
	    int y=5;
	    while(x==y)
	    {
	        System.out.println("Hello");
	        x++;
	        y++;
	    }
	    */

	}

}
