package pack1;

import java.util.Scanner;


class Addition{
	
int a,b;
Scanner s=new Scanner(System.in);

void add()
{
	System.out.println("Value of a and b");
	a=s.nextInt();
	b=s.nextInt();
	
	int sub=a+b;
	System.out.println("Addition is"+sub);
}
}
class Subtract extends Addition{
	int a,b;
	Scanner s=new Scanner(System.in);
	
	void sub()
	{
		System.out.println("Value of a and b");
		a=s.nextInt();
		b=s.nextInt();
		
		int sub=a-b;
		System.out.println("Subtraction is"+sub);
	}
}
public class Userdefined {

	public static void main(String[] args) {
		Subtract st= new  Subtract();
		st.add();
		st.sub();

	}

}
