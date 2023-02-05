package fundamentals;
import java.util.Scanner;
public class swapAlternate {

	public static void swapalternate(int [] arr) 
	{
		
		for(int i=0;i<arr.length;i+=2)
		{
		    if(i==arr.length-1 && i%2==0)
		    {  
		     break;
		     }
		int temp = arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;

		}
	}

		
		public static void main(String[] args)
		{
			int [] arr= {1,4,7,6,5};
			swapalternate(arr);
		}
		
	}

