package ExceptionalHandling;

public class ExceptionalHandlingEx2 {
	
			public static void main(String[] args) {
			try 
			{
				int[] numbers = {1, 2, 3};
				System.out.println(numbers[50]);
			} 
			catch (Exception e) 
			{
				System.out.println("Some Error in code.");
			}
		}
	}