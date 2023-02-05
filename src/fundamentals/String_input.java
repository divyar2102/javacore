package fundamentals;
import java.util.*;
public class String_input {

	
	//public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		System.out.println(str+" "+str.length());

	}
	public static void main (String[] args) {
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
		    str1.append((char)('a'+i));
		}
		System.out.println(str1);
		}*/
	public static void main(String[] args) 
	{ 
		String str1 = new String ("I love coding"); 
	    String str2 = "I love coding"; 
	    boolean check=(str1=="I love coding");
	    System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check); 
	} 
}
