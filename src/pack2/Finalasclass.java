package pack2;

import Inheritance.A;
import Inheritance.B;

final class A{
	void display() {
		System.out.println("Class A");
	}

}
class B extends A{
	void display() {
		System.out.println("Class B");
	}
}

public class Finalasclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();
		

	}

}
