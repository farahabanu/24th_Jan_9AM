package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alerthandling_withExpectedConditions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*
		 * Testcase:--> Verify job search functionality with invalid Data
		 * Steps:--> 	Given  http://firstnaukri.com
		 * 				when click search button without data entry
		 * 				then receive popup window with text.
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		//Identify Search button location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Write condition statement to verify alert presented at webpage
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			//block of code execute only on alert presented
			Alert alert=driver.switchTo().alert();
			String alert_text=alert.getText();
			System.out.println("Alert msg is => "+alert_text);
			
			
			//using alert referral Close alert window
			alert.accept();
		}
		else
			System.out.println("Alert not presented");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
