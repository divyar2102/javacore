package fundamentals;
import java.util.Scanner;
public class Tri_Pat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=5;
			j=i;
			while(j>=1)
			{
				System.out.print(j);
				j-=1;
			}
			System.out.println();
			i+=1;
		}
	}

}
