package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{

	public static void main(String[] args) throws Exception
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
	
	Alert alert=driver.switchTo().alert();
	String alert_text=alert.getText();
	System.out.println("Alert msg is => "+alert_text);
	
	
	//using alert referral Close alert window
	alert.accept();
		
	
		/*
		 * Capture text on alert window
		 * 
		 * 	driver.switchTo().alert().getText();
		 * 
		 * Accept popup window    [It close window]
		 * 	
		 * 	driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window   [It close window]
		 * 
		 * 	driver.switchTo().alert().dismiss();
		 * 
		 * Send text to popup-window  [Prompt window]
		 * 
		 * 	driver.switchTo().alert().sendkeys("text");
		 */
		
		
		
	/*	
	 * Alert Exceptions:-->
	 * 		UnhandledAlertException
	 * 		NoAlertPresentedException
	 * 
	 * unhandledAlertException:-->
	 * 			=> Exception presented on unexpected alerts.
	 * 
	 * NoAlertpresentedException:-->
	 * 			=> When user type syntax switch to alert
	 * 			   where it was not presented.
	 * 		
	 */
		
		
		
		

	}

}
