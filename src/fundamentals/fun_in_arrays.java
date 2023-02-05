package fundamentals;
import java.util.Scanner;
public class fun_in_arrays {

	//function 1 for printing
	public static void printArray(int [] arr) {
		int n=arr.length;
		for(int i=0; i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	 //function 2 for taking input
	
	public static int[] takeInput()
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element"+i+"th index");
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= takeInput();
		int key=3;
		printArray(arr);
		linearSearch(arr);
		
	}

}
