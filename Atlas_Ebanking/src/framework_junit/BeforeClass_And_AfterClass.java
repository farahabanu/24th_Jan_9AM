package framework_junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass {

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
