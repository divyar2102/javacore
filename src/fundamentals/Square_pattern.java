package fundamentals;
import java.util.Scanner;
public class Square_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * 1 1 1 1
		 * 1 1 1 1
		 * 1 1 1 1
		 * 1 1 1 1
		 * 
		 */
		Scanner s =new Scanner(System.in);
		int i=1;
		int n =s.nextInt();
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print('4');
				j+=1;
			}
			i+=1;
			System.out.println();
			
		}
	}

}
