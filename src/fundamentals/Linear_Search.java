package fundamentals;
import java.util.*;
public class Linear_Search {

	public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        //int x=s.nextInt(arr);
        
        for(int i=0;i<n;i++)
        {
            //System.out.println()
            arr[i]=s.nextInt();
        }
        
        
        return arr;
    }
    
	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }
	public static void main(String args[])
	{
		
	}
}
