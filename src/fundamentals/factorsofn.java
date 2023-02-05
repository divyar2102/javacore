package fundamentals;
import  java.util.Scanner;
public class factorsofn {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner (System.in);
        int n =s.nextInt();
        int i=2;
        while(i<n)
        {
            if(n%i==0)
            {
                System.out.println(i);
                
            }  
            i=i+1;
        }
    }
}