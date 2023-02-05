package fundamentals;
import java.util.Scanner;
public class Char_Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				char jthChar=(char)('A'+i-1);
				System.out.print(jthChar);
				j+=1;
			}
			System.out.println();
			i+=1;
		}
	}

}
