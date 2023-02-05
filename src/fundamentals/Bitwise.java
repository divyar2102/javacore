package fundamentals;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;   // 1010 in case of bitwise & 0 0 =0 and 1 1=1
		// 1 0 =0 and 0 1 =1
		int b=2;    // 0010
		int c=a&b;  // 0010 
		//System.out.println(c); // ans2
		System.out.println(a&b);
		
		
		int a1=10;
		int b1=2;
		int c1=a1|b1;
		//System.out.println(c1); //10 ans
		System.out.println(a|b);
		
		/*in case of OR
		1010
		0010
		1010*/
	}

}
