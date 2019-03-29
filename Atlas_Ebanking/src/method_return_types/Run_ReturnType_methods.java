package method_return_types;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class Run_ReturnType_methods extends Repository
{
	String Exp_title="Facebook – log in or sign up";
	String Exp_url="https://www.facebook.com/";
	@Test
	public void verify_page_title_presented()
	{
		load_webpage("http://facebook.com");
		Assert.assertTrue(isTitle_presented(Exp_title));
		System.out.println("Expected title presented");
	}
	
	
	@Test
	public void verify_page_url_presented()
	{
		
		Assert.assertTrue(isurl_presented(Exp_url));
		System.out.println("Expected url presented");
	}
	
	@Test
	public void verify_text_visible_at_webpage()
	{
		String Exp_text="Create an account";
		Assert.assertTrue(Verify_text_visible(Exp_text));
		System.out.println("Expected text visible at webpage");
	}
	
	
	@Test
	public void verify_text_presented_At_particular_location()
	{
		String Exp_text="It's free and always will be.";
		boolean flag=Verify_text_presentedAt_element(By.xpath("//div[contains(@class,'_52lr fsm fwn fcg')]"), Exp_text);
		
		Assert.assertTrue(flag);
		System.out.println("Expected text visible at expected location");
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		launch_browser("chrome");
		set_timeout(50);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();  //global variable from repository
		
	}
	
}
