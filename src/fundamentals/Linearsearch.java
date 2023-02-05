package fundamentals;
import java.util.Scanner;
public class Linearsearch {
	public static linear(int [] arr,int key)
	{
		
	}
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n];
        
        System.out.println(n);
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=s.nextInt();
        	
        }
        System.out.print("Enter the key");
        int key=s.nextInt();
        int pos=-1;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==key)
        		pos=i;
        		break;
        }
        if(pos!=-1)
        	System.out.println("Found"+(pos+1));
        
        else
        	System.out.println("no");
        
        
    }
	
}