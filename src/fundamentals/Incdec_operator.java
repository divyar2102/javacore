package fundamentals;
//import java.util.Scanner;
public class Incdec_operator {

		public static void main (String[] args) {
/*
		    int a=10,b=50;
		    a++;
		    --b;
		    int c=a--+b--;
		    System.out.print(++c);
		}*/
	    int a=10,b=20;
	    System.out.println(a+++--b);//line 1
	    System.out.println(a--+++b);//line 2
	    System.out.println(a++-++b);//line 3
	    System.out.println(a+++++b);//line 4
	}
}


