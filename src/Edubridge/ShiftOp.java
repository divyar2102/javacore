package Edubridge;
import java.util.*;
public class ShiftOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int a=10;
		int b=20;
		//Shift operators
		System.out.println(a>>2);//left shift
		System.out.println(a<<2);
		//relational operators
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		
		//bitwise operator
		int x=20;
		int y=10;
		System.out.println(x|y);
		System.out.println(x&y);
		System.out.println(~x);
		System.out.println(x^y);
		
		//logical operator
		System.out.println((x==20)&&(x==10));
		
		System.out.println((x<y)||(y>x));
		
		//ternary operator
		
		int n=10;
		String res;
		res=(n%2)==0?"even":"odd"; //even odd
		System.out.println(res);
		
		int n1=10;
		int n2=20;
		String max=(n1>n2)?"n1 is greater":"n2 is greater";//maximum of two numbers
		String min=(n1>n2)?"n1 is greater":"n2 is greater";//minimum of two numbers
		System.out.println(max);
		System.out.println(min);
		
		int n11=10;
		int n22=20;
		int n33=30;
		String mx = (n11>n22 && n11>n33)?"n1 is greater":(n22>n11 && n22>n33)?"n2 is greater":"n3 is greater"; //max of 3
		String mn = (n11<n22 && n11<n33)?"n1 is smaller":(n22<n11 && n22<n33)?"n2 is smaller":"n3 is smaller";//min of 3
		
		System.out.println(mx);
		System.out.println(mn);
		
		
		int age=s.nextInt();
		String ans=(age>18)?"Eligible":"Not Eligible";//eligibility for voting
		System.out.println(ans);
		
		
		//assignment operators or shorthand
		
		int p=10;
		
		System.out.println(p+=2);
		
		String st="Hello";
		
		System.out.println(st);
		
	}

}
