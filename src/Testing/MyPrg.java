package Testing;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class Mytest
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

public class MyPrg {
	

		private static Mytest m;
		
		@BeforeClass
		public static void setUp()
		{	
		m =  new Mytest();	//create object
		System.out.println("Test data set up");
		
		}
		@Before
		public void before1()
		{
			System.out.println("Before method executed");
		}
		
		@Test
		public void positiveNumberAddition() 
		{
			assertEquals(10, m.add(5,5));
		}
		@Test
		public void negativeNumberAddition()
		{
			assertEquals(-10, m.add(-6, -4));
		}
		@After
		public void after1()
		{
			System.out.println("after method executed");
		}
		@AfterClass
		public static void afterClass1()
		{
			System.out.println("after method executed");
			m = null;     //object terminate or distroy
		}

}