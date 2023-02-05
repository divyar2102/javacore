package fundamentals;

import java.util.*;
public class StudentUse {
	public static void main(String[] args)
	
	
	{
//		Scanner s=new Scanner(source);
		
		String name;
		//private roll=45; //roll shows errror bcoz private is mentioned
		Student s1=new Student();//objects
		Student s2=new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1.name="Divya";
		s1.roll=56;
		
		System.out.println(s1.name);
		
		s2.name="D";
		s2.roll=56;
		System.out.println(s1.roll);
		System.out.println(s1.roll);
		
		
		
		
		
		
	}

}
