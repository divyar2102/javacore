package Edubridge;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=3; 
		 
		//Switch expression 
		 switch(a){ 
		 //Case statements 
		 case 1: System.out.println("I am @ Home"); 
		 break; 
		 case 2: System.out.println("I am @ Office"); 
		 break; 
		 case 3: System.out.println("I am @ school"); 
		 break; 
		 //Default case statement 
		 default:System.out.println("Not @ Home, Office, or school"); 
		 }
		*/
		/*
		 Scanner s=new Scanner(System.in);
		 
		 int n1,n2;
		 n1=s.nextInt();
		 n2=s.nextInt();
		 
		 int exit;
		 System.out.println("Enter the operator");
		 int op=s.next().charAt(0);
		 
		 switch(op) 
		 {
			case '+':
				System.out.format("%d + %d = %d\n", n1, n2, n1 + n2);
				break;
			case '-':
				System.out.format("%d - %d = %d\n", n1, n2, n1 - n2);
				break;
			case '*':
				System.out.format("%d * %d = %d\n", n1, n2, n1 * n2);
				break;
			case '/':
				System.out.format("%d / %d = %d\n", n1, n2, n1 / n2);
				break;
			default:
				System.out.println("Invalid");
				exit=s.nextInt();
			}*/
		 int a , b;
			char op;
			int exit=0;
			Scanner scanner = new Scanner(System.in);
			
			while (exit==0) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			op = scanner.next().charAt(0);
			switch(op) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			case '%':
				System.out.println(a%b);
				break;
			default:
				System.out.println("Invalid");	
			}
			System.out.println("1 to exit, 0 to continue");
			exit = scanner.nextInt();
			}
		}

	}