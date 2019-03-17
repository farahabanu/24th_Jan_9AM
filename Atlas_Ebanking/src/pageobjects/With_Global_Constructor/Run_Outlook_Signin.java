package pageobjects.With_Global_Constructor;


import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Outlook_Signin 
{
	static WebDriver driver;
    static String url="http://outlook.com";
	static Outlook_Signin Signin;
	static String Exp_Domain_errText="That Microsoft account doesn't exist. Enter a different account or get a new one.";
	
	
	
	@Before
	public void pre_condition()
	{
		driver.get(url);
		Signin.Signin_btn.click();
	}

	@Test
	public void ValidateEmail_With_InvalidDomain() throws Exception
	{
		
		Signin.Email_EB.clear();
		Signin.Email_EB.sendKeys("qadarshan@gmail.com");
		
		Signin.Email_next_btn.click();
		Thread.sleep(5000);
		
		String Act_ErrText=Signin.Invalid_Domain_error_msg.getText();
		Assert.assertEquals(Exp_Domain_errText, Act_ErrText);
		System.out.println("Test Pass Expected Error msg visible at webapge");
	}
	
	
	@Test
	public void Email_validation_With_valid_email() throws Exception
	{
		Signin.Email_EB.clear();
		Signin.Email_EB.sendKeys("sunilreddy.gajjala@outlook.com");
		
		Signin.Email_next_btn.click();
		Thread.sleep(5000);
		
		
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Create object for class
		Signin=new Outlook_Signin(driver);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}
