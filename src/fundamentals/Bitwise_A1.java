package fundamentals;

public class Bitwise_A1 {
	public static void main (String[] args) {
	    int a=10,b=20;
	    int c=a&b;
	    System.out.println(c);
	    int d=a|b;
	    System.out.println(d);
	    int e=a^b;
	    System.out.println(e);
	    int f=c+d+e;
	    System.out.println(~f);
	    
	    int a1=10,b1=-20;
	    System.out.println(a1^b1);
	    
	    System.out.println(a<<1);
	    
	    System.out.println(a>>1); //ans = 10/2^1 = 10/2
	    

	}

}
