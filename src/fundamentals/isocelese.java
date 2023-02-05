package fundamentals;
import java.util.Scanner;
public class isocelese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int sp=1;
			while(sp<=n-i) {
				System.out.print(' ');
				sp++;
			}
			int num=1;
			while (num<=i)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
			i++;
		}
		
	}

}
