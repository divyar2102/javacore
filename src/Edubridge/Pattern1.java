package Edubridge;
import java.util.Scanner;
	
		//i rows j colums
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		/*
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*
		int alphabet = 65;
        
        
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }*/
		
		
		/*
		int c=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				c++;
				System.out.print(c);
			}
			System.out.println();
		}*/
		/*
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(c);
			}
			System.out.println();
		}
		int row = 3;
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=  row  - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/
		
		public class Pattern1 {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter a Number");
				int number = s.nextInt();
				for (int i = 1; i <= number; i++) {
					for (int j = 1; j <= number - i; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= i; k++) {
						System.out.print(" *");
					}
					System.out.println(" ");
				}
			}

		}
    }
}
	