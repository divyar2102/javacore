package Testing;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssetEx2 {
		@Before  //it will run before every test
		public void beforeTestMethod()
		{
			System.out.println("@before:- runbeforetestmethod");
		}	
	
	@After   //it will run after every test
	public void afterTestMethod()
	{
		System.out.println("@after:- runbeforetestmethod");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("test 1");
}
	
	@BeforeClass   //it will run first and only run once
	public  static void beforeClass()
	{
		System.out.println("@beforeclass:- before Class run only once");
	}
	@AfterClass   //it will run last and only run once
	public  static void afterClass()
	{
		System.out.println("@afterclass:- after Class run only once");
	}
	@org.junit.Ignore
	public void Ignore()
	{
		System.out.println("ignore");
	}
	
	@Test(timeout = 100)
	public void Test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(timeout = 800)
	public void Test3()
	{
		System.out.println("Test 3");
	}
}
