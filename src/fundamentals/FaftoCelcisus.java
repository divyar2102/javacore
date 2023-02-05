package fundamentals;
import java.util.Scanner;
public class FaftoCelcisus {

	public static int printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        
		public class Solution {
			
			public static boolean checkMember(int n){
		        int a = 0; 
		        int b = 1;
		        int c = -1;
		        boolean isFib=false;
		        while (a<n) {
		            c = a + b;
		            a = b;
		            b = c;
		            if (a==n){
		                isFib=true;
		            }
		        }
		        return isFib;

			}
			

		}
		Footer
		© 2022 GitHub, Inc.