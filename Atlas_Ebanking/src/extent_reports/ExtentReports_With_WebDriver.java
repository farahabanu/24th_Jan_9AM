package extent_reports;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_With_WebDriver
{
	//Target file location
	static String filepath="D:\\sunill\\24th_Jan_9AM_2019\\Extent_reports\\";
	static ExtentReports logger;
	static String filename="TestResult1.html";
	static WebDriver driver;
	static String url="http://outlook.com";
	
	
	
	@Test
	public void Tc001_UserLogin() throws Exception
	{
		ExtentTest test1=logger.startTest("Tc001_UserLogin");
		
		driver.get(url);
		test1.log(LogStatus.INFO, "Application load successfull");
		
		WebElement Signin_btn=driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader']"));
		Signin_btn.click();
		test1.log(LogStatus.INFO, "Signin button clicked");
		
		WebElement Email_editbox=driver.findElement(By.xpath("//input[@type='email']"));
		Email_editbox.clear();
		Email_editbox.sendKeys("sunilreddy.gajjala@outlook.com");
		test1.log(LogStatus.INFO, "Email Enter successfull");
		
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		Next_btn.click();
		test1.log(LogStatus.INFO, "Next button clicked");
		
		Thread.sleep(5000);
		test1.log(LogStatus.INFO, "Static timeout waiting for 5 seconds");
		
		
		//Capture screen
		String imagepath=filepath+"\\Screens\\Email_valid.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(imagepath));
		
		//Verify password visible at webpage
		WebElement Password_Editbox=driver.findElement(By.xpath("//input[@name='passwd']"));
		if(Password_Editbox.isDisplayed())
		{
			test1.log(LogStatus.PASS, "Test pass Screen captured ",test1.addScreenCapture(imagepath));
		}
		else
		{
			test1.log(LogStatus.FAIL, "Failure screen captured",test1.addScreenCapture(imagepath));
		}
		
		logger.endTest(test1);
		
		
	}
	
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		logger=new ExtentReports(filepath+filename, true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		logger.flush();
	}


}
