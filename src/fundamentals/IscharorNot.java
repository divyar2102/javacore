package fundamentals;
import java.util.Scanner;
public class IscharorNot {
    
    public static void main(String[] args) {
        // Write your code here
		Scanner s = new Scanner(System.in);
        String st = s.next();
        char ch = st.charAt(0);
        //System.out.println(ch);
        
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n1");
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n0");
     
        else
            System.out.println("\n-1" );
    }
}