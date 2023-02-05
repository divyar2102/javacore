package pack1;

class PrivateClass
{
	private int a=12;
	private void display()
	{
		System.out.println("Private variable"+a);
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
		PrivateClass p=new PrivateClass();
		p.a;
		p.display();
	}

}
