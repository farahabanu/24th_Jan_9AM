package selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Keyboard_ShortCuts
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		/*
		 * Sendkeys:-->
		 * 		Command allow user to type "character_sequence"
		 * 		and "KeyBoard" shortcuts.
		 * 
		 * 		character sequences:--<
		 * 			
		 * 					Sendkeys("abcd---z");
		 * 
		 * 		keyboard shortcust:--.
		 * 				
		 * 					sendkeys(keys.tab);
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("http://gmail.com");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		//Identify email location and enter text
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		Thread.sleep(5000);   //Timegap to load password element
		
		
		//Identify password locator
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password"))
		.sendKeys("hello12345",Keys.ENTER);

	}

}
