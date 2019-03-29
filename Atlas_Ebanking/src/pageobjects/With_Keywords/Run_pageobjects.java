package pageobjects.With_Keywords;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Run_pageobjects extends Keyword
{
	static Outlook_Signin signin;
	static String url="https://www.outlook.com/";
	
	@Test
	public void Email_Validation()
	{
		Click_element(signin.Signin_btn);
		Enter_text(signin.Email_EB, signin.email);
		Click_element(signin.Email_next_btn);
		Enter_text(signin.password_EB, signin.password);
		Click_element(signin.login_submit_btn);
	}
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		launch_browser("chrome");
		load_webpage(url);
		set_timeout(50);
		
		//Create object to access page objects
		signin=new Outlook_Signin(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();  //global variable from repository
		
	}


}
