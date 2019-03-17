package framework_junit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_And_After {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Setup-Beforeclass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Teardown-Afterclass");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("pre-method");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("post-method"+"\n");
	}

	@Test  //@Test annotation invoke method execution without object creation
	public void test1() 
	{
		System.out.println("Test1 Executed");
	}
	
	@Test  //@Test annotation invoke method execution without object creation
	public void test2() 
	{
		System.out.println("Test2 Executed");
	}
	
	
	@Test  //@Test annotation invoke method execution without object creation
	public void test3() 
	{
		System.out.println("Test3 Executed");
	}

}
