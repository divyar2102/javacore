package fundamentals;

public class xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1^0 1
		 * 1^1 0 tru ^tru == false
		 * 0^0 0 false ^false==false
		 * 0^1 1
		 * 
		 * 
		 * 
		 */
		int a=10;
		int b=2;    // 0010
		//int c=a&b;  // 0010 
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
	
		 for(int i = 0; i < 3; i++) {
		        System.out.print(i + " ");
		        }
		    //System.out.print(i + " ");
		    
}
	}


