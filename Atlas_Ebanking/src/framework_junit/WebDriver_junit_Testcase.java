package framework_junit;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_junit_Testcase
{
	static WebDriver driver;
	String url="http://gmail.com";
	

	@Test
	public void Verify_userLogin_with_invalidPassword() throws Exception 
	{
		//Load webpage
		driver.get(url);
		
		//Identify email location and enter text
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		Thread.sleep(5000);   //Timegap to load password element
		
		
		//Identify password locator
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password"))
		.sendKeys("hello12345",Keys.ENTER);
		
		Thread.sleep(5000);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		driver=new ChromeDriver();
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
