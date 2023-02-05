package Edubridge;

public class StringBufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String builder is asynchronous
		
		//diff bw string build and string buffer viva q
		StringBuffer str=new StringBuffer("Cooking");
		str.append("Emerging");
		System.out.println(str);
		str.insert(7,"technology");
		System.out.println(str);
		str.replace(0,7,"Iot");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println(str.capacity());
		
	}

}
