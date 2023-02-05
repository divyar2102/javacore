package pack1;
class Emp{
	String ename="Divya";
	int eno;
	Emp(int eno)
	{
		this.eno=eno;
		
	}
	void disp()
	{
		System.out.println("Emplooyee class"+eno);
	}
}
class Dept extends Emp{
	String ename="Abc";
	Dept(){
		super(20);
	}
	void disp()
	{
		super.disp();
		
		System.out.println("Department class");
		System.out.println("Ename"+super.ename);
		
	}
}



public class MethodOverriding {

	public static void main(String args[])
	{
		Dept d = new Dept();
		d.disp();
//		Emp e=new Emp;
//		e.disp();
	}
}
