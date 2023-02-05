package pack2;
class A{
	final void display() {
		System.out.println("Class A");
	}

}
class B extends A{
	void display() {
		System.out.println("Class B");
	}
}

public class Finalasmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();

	}

}