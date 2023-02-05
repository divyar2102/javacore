package PracticeProgs;

class A{
	int a,b;
	void addi(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
}
public class ParametCons {

	public static void main(String[] args) {
		A obj=new A ();
		obj.addi(12,2);
		
	}

}
