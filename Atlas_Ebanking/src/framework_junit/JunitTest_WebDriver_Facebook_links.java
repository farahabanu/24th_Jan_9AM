package framework_junit;


import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JunitTest_WebDriver_Facebook_links {

	static WebDriver driver;
	
	
	@Test
	public void Verify_SignUp_link()
	{
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Title verified Signup page displayed");
	}
	
	
	@Test
	public void verify_login_link()
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).click();
		String Exp_title="Log in to Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Title verified login page displayed");
	}
	
	
	@Before
	public void setUp() throws Exception
	{
		driver.get("http://facebook.com");
		Thread.sleep(1000);
	}

	@After
	public void tearDown() throws Exception 
	{
		//Create object for date
		Date d=new Date();
		//Create simple date foramatter
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//using simpel date foramt convert date
		String time=sdf.format(d);
		

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
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
