package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_TryCatch_Exception_Handling {

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
		//Search_btn.click();
		Thread.sleep(5000);
		
		
		try {
			
			//block of code execute only on alert presented
			Alert alert=driver.switchTo().alert();
			System.out.println("Alert presented");
			String alert_text=alert.getText();
			System.out.println("Alert msg is => "+alert_text);
			
			//using alert referral Close alert window
			alert.accept();
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			System.out.println("Alert not presented");
		}
		
		
		System.out.println("Run continuted");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
