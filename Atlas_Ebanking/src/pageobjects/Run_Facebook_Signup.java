package pageobjects;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Facebook_Signup 
{
	static WebDriver driver;
	static String url="http://facebook.com";
	FB_Signup Signup;  //Global variables
	
	@Test
	public void user_signup()
	{
		
		//Access pagefactory class to identify class objects.
		Signup=PageFactory.initElements(driver, FB_Signup.class);
		
		Signup.Firstname_EB.clear();
		Signup.Firstname_EB.sendKeys("Rakesh");
		
		Signup.Surname_EB.clear();
		Signup.Surname_EB.sendKeys("Arjun");
		
		Signup.Username_OR_Mobile_EB.clear();
		Signup.Username_OR_Mobile_EB.sendKeys("Rakesharjun@gmail.com");
	}
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}


}
