 
package fundamentals;
import java.util.Scanner;
public class Array_A1 {

	
		 public static void main(String args[]){
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int []arr= new int [n];
		        
		        for(int i=0;i<n;i++)
		        {
		        	System.out.println("enter the element at"+i+"th index");
		        	arr[i]=s.nextInt();
		        }
		        for(int i=0;i<n;i++)
		        {
		        	System.out.println(arr[i]);
		        }
		        
		    }
		}	

	


