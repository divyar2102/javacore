package pack1;

import java.util.Scanner;

class Add {
	int a, b;
	Scanner s = new Scanner(System.in);

	void add() {
		System.out.println("a and b");
		a = s.nextInt();
		b = s.nextInt();
		int c = a + b;
		System.out.println(c);
	}
}

class Sub extends Add {
//	int a, b;
//	Scanner s = new Scanner(System.in);

	void subb() {
		
//		System.out.println("a and b");
//		a = s.nextInt();
//		b = s.nextInt();
//		int c = a - b;
		System.out.println(a-b);
	}
}

class Mul extends Sub {
//	int a, b;
//	Scanner s = new Scanner(System.in);

	void mul() {
//		System.out.println("a and b");
//		a = s.nextInt();
//		b = s.nextInt();
//		int c = a * b;
		System.out.println(a*b);
	}
}

public class User {

	public static void main(String[] args) {
		Mul s = new Mul();
		s.add();
		s.subb();
		s.mul();
	}
}