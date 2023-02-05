package fundamentals;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'D','I','V','Y','A'};
		String str1="DIVYA";
		String str2="Good girl";
		String str3="DIVYA";
//		str1=str1.concat(str2); used to concatenate two strings
		System.out.println(str1);
		System.out.println(str1.equals(str2)); //equals is used to compare the character present in the string
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.charAt(4));
		
		String substr=str1.substring(3);
		String substr1=str1.substring(1,3);
		System.out.println(substr1);
		System.out.println(substr1.length());
		
		String a1="coding";
		for(int i=2;i<4;i++)
		{
		    System.out.print(a1.substring(i));
		}
		System.out.println();
		
		
		String a2="coding";
		for(int i=2;i<5;i++)
		{
		    System.out.print(a2.substring(i-2,i+1));
		}
		System.out.println();
		
		/*
		String a ="abcd";
		String b="abcda";
		System.out.println(a.compareTo(b));*/
		
		String a="coding",b="ninjas";
		if(a.contains("ing"))
		{
		    a+=b;
		}
		else
		{
		    b+="ing";
		}
		System.out.print(b+a);
		
		
//	System.out.println(str.length());
//	System.out.println(str.charAt(2));
//		System.out.println(str.charAt(-1));  array outofindex 
//		System.out.println(str.charAt(8));
//		System.out.println(str1.length());
	}

} 


