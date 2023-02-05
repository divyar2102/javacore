package PracProg;
import java.util.Scanner;
class AddComplexno{
	int real,img;
	public AddComplexno(int r,int i)
	{
		this.real=r;
		this.img=i;
		
	}
	
	public  void show()
	{
		System.out.println(this.real+"+"+this.img+"i");
	}
	public static AddComplexno add(AddComplexno n1,AddComplexno n2)
	{
		AddComplexno res= new AddComplexno(0,0);
		res.real=n1.real+n2.real;
		res.img=n1.real+n2.img;
		
		return res;
	}
	
	public static void main(String args[])
	{
		int c1,c2;
		AddComplexno c11= new AddComplexno(2,3);
		AddComplexno c22= new AddComplexno(10,5);
		
		c11.show();
	c22.show();
	AddComplexno res= add(c11,c22);
	res.show();

	}
}