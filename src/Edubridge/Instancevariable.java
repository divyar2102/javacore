package Edubridge;

class Subject
{
	
	static String subName="JAVA";
	int javaMarks;//instance variables
	int pythonMarks;
	void displayMarks()
	{
		System.out.println("Java Marks"+javaMarks);
		System.out.println("Python Marks"+pythonMarks);
		
	}
	
}
public class Instancevariable 
{
	public void displayAge()
	{
		int age = 0;//Local variable
		age = age + 10;
		System.out.println(age);
	}

	public static void main(String[] args) 
		{
			Instancevariable instancevariable =new Instancevariable();
			
			instancevariable.displayAge();
			Subject s=new Subject();
			s.javaMarks=43;
			s.pythonMarks=54;
			//System.out.println("Java Marks"+s.javaMarks);
			//System.out.println("Python Marks"+s.pythonMarks);
			s.displayMarks();
			System.out.println("Subject name"+Subject.subName);
		
		}
	

}


