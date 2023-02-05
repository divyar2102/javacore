package pack1;

class DefaultDemo {
	int a = 12;

	void display() {
		System.out.println("Default class " + a);
	}
}

class DefaultSubClass extends DefaultDemo { // sub class
	void displaySub() {
		System.out.println("Default subclass ");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		DefaultDemo d = new DefaultDemo();
		d.display(); // u can access inside same pakage

		DefaultSubClass ds = new DefaultSubClass();//default can also used in subclass
		ds.displaySub();
	}

}