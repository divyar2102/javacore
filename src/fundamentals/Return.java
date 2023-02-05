package fundamentals;
import java.util.Scanner;
public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
//		int div =2;
//		while(div<=n/2)
//		{
//			if (n%div==0)
//			{
//				System.out.println("Composite");
//				return ; // we have used return becz if we divide 1000/2 it gives 0 so this is composite so no need to divide further
//			}
//			div = div +1;
//	}
//	System.out.println("Prime");
//}
	int i=10;
    while((i=i-1)>0)
    {
        System.out.print(i);
        if(i%5==0)
            return;
    }
}

}
