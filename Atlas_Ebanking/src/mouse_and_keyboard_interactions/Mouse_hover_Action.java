package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_Action 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		/*
		 * Enable Mouse and keyboard interactions on automation browser
		 */
		Actions action=new Actions(driver);
		//Identify location before hover
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		//Perform mouse hover action on element
		action.moveToElement(Category).perform();
		
		
		//Identify location
		WebElement Mobiles=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		action.moveToElement(Mobiles).perform();
		
		//Identify location
		WebElement Laptops=driver.findElement(By.xpath("//span[contains(.,'Laptops')]"));
		//Click on element method using mouse actions
		action.click(Laptops).perform();
		
	}

}
