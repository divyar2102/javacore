package fundamentals;

public class Scopeofvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		a=100; // initalizing a with other value
		System.out.println(a);
		if (a>=100)
		{
//			int a=10;
			int b =10;
			System.out.println(b);
		}
		else {
			int c= 20;
			System.out.println(c);
		}
		//System.out.println(b);  we try to access b which was declared in if 
		System.out.println(a);
		
		
		
		
	}

}
/* we cant have two variables with same name
*/