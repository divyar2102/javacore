package Edubridge;

public class StringBuilderex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String builder is asynchronous
		
		//diff bw string build and string buffer viva q
		/*
		StringBuilder str=new StringBuilder("Cooking");
		str.append("Emerging");
		System.out.println(str);
		str.insert(7,"technology");
		System.out.println(str);
		str.replace(0,7,"Iot");
		System.out.println(str);
		str.reverse();
		System.out.println(str);	
		System.out.println(str.length());
		System.out.println(str.capacity());
		*/
		StringBuffer sb1 = new StringBuffer();
        //printing default capacity of string buffer  
        System.out.println("sb1: default capacity: " + sb1.capacity()); 
        // current size 16+10 = 26
        StringBuffer sb2 = new StringBuffer("Welcome to");
        System.out.println("sb2: After declaration capacity: " + sb2.capacity());

	}

}
