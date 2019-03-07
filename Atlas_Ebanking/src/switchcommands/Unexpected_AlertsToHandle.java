package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unexpected_AlertsToHandle
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		/*
		 * FAQ:--> How to handle unexpected popups at webpage
		 * 
		 */
		try {
			
			driver=new ChromeDriver();
			driver.get("https://www.firstnaukri.com/jobs-internship");
			driver.manage().window().maximize();
			
			//Identify Search button location
			WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
			Search_btn.click();
			
			//identifying elemnt without close alerts...
			driver.findElement(By.id("X"));
			
		} catch (UnhandledAlertException e) {
			System.out.println("there is one unhandledalert presented at webpage");
			//block of code execute only on alert presented
			Alert alert=driver.switchTo().alert();
			System.out.println("Alert presented");
			String alert_text=alert.getText();
			System.out.println("Alert msg is => "+alert_text);
			
			//using alert referral Close alert window
			alert.accept();
		}

	}

}
