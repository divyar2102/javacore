package fundamentals;
import java.util.Scanner;
public class Sq_pat2 {

	public static void main(String[] args) {
		// TODO Auto-genrated method stub
		Scanner s =new Scanner(System.in);
		int i=1;
		int n =s.nextInt();
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(j);
				j+=1;
			}
			i+=1;
			System.out.println();
			
		}
	}

}
