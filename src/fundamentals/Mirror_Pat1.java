package fundamentals;
import java.util.Scanner;
public class Mirror_Pat1 {

	
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
	        int n=s.nextInt();
	        int i=1;
	        while(i<=n)
	        {
	        
	            int sp=1;
	            while(sp<=n-i)
	            {
	                System.out.print(' ');
	                sp+=1;
	            }
	            int num=1;
	            while(num<=i)
	            {
	                System.out.print(num);
	                num+=1;
	               
	            }
	            System.out.println();
	            i+=1;
	        }
			
		}

	}
