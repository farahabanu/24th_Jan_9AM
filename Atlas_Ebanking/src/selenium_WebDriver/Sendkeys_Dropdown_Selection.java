package selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Dropdown_Selection 
{

	public static void main(String[] args)
	{
		
		/*
		 * Sendkeys:-->
		 * 			We can use keyboard shortcuts on
		 * 			selected WebElement.
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("http://facebook.com");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		//Select dropdown option using keyboard characters]
		driver.findElement(By.id("day")).sendKeys("24");

		//Select dropdown option using keybord shortcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		/*
		 * Note:-->
		 * 			For keyboard shortcuts webdriver doesn't
		 * 			throw exception when command failed;
		 */
		
		
		
		
	}

}
