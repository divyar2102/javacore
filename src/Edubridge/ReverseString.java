package Edubridge;

public class ReverseString {

	public static void main(String[] args) {
		/* Method 1
		String str= "Divya", st="";
		char ch;
				
		System.out.print("Original word: ");
		System.out.println("Divya"); 
				
		for (int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i); 
			st= ch+st; 
		}
		System.out.println("Reversed word: "+ st);
		}*/
		
		String input = "DIVYA";

       StringBuilder str = new StringBuilder();
       str.append(input);
       str.reverse();
       System.out.println( "Reversed String  : " +str);

	}
}

		
