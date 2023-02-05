
package fundamentals;
import java.util.Scanner;
public class Tri_Pat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int a=1;
		while(i<=n)
		{
			int j=1;
			
			while(j<=i)
			{
				System.out.print(a);
				a+=1;
				j+=1;
			}
			System.out.println();
			i+=1;
		}
	}

}
