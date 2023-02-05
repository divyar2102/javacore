package Edubridge;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * create string 
		 * 1. String literal 2. Using new keyword 3.Buffer
		compare()
		concat() 
		equals() 
		split()
		length()
		compareTo()		 
		diff bw string literal s='divya'
		strign pool==>>*/
		
		String s1=" Divya   ";
		String s2="Raulo";
		System.out.println(s1+s2);		//using +operator
		System.out.println(s1.concat(s2));
		String s3="My name is";//using concat
		System.out.println(s1.length());
		System.out.println(s3.concat(s1));
		System.out.println("Substring: "+s3.substring(4,7));
		System.out.println("uppercase:-"+s1.toUpperCase());
		System.out.println("lowercase:-"+s1.toLowerCase());
		
		String a="";
		System.out.println("Null or not"+a.isEmpty());
		System.out.println("Null or not"+a.isBlank());
		
		char [] arr=new char[10];
		s3.getChars(0, 10, arr, 0);
		System.out.println("Get chars:-"+Arrays.toString(arr));
		
		String s="divya";
		System.out.println("Compare to:"+s.compareTo(s1)); //
		System.out.println("Compare 1:"+s1.compareTo(s)); //
		System.out.println("Equal to "+s1.equals(s));//Divya!=divya
		System.out.println("Ignore the case:"+s1.equalsIgnoreCase(s));
		
		System.out.println("Stars with "+s1.startsWith("D"));
		System.out.println("ends with "+s1.endsWith("a"));
		System.out.println("replace with "+s1.replace("D","d"));
		System.out.println("replace with "+s1.replace("Divya","Dipu"));
		System.out.println("Repeat with "+s1.repeat(7));
		System.out.println("CharAt "+s1.charAt(3));
		System.out.println("Trim leading with:"+s1.stripLeading());
		System.out.println("Trim trailing:"+s1.stripTrailing());
		System.out.println("Trim with"+s1.trim());
	}

}
