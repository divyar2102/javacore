
package fundamentals;

import java.util.Scanner;
public class MarkSheet {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String st=s.next();
        char ch=st.charAt(0);
        System.out.println(ch);
        int m1,m2,m3,avg;
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();
        avg = (m1+m2+m3)/3;
        
            
        System.out.println(avg);
            
            
	}

}
