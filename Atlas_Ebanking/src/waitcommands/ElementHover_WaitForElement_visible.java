package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHover_WaitForElement_visible 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//enable Mouse and keyboard interactions at automation browser
		Actions action=new Actions(driver);
		
		//Identify location
		WebElement Products_Menu=driver.findElement(By.linkText("Products"));
		//Perfrom mouse hover action on products menu
		action.moveToElement(Products_Menu).perform();
		

		//manage explicit wait until object visible at webpage
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.visibilityOfElementLocated
				(By.linkText("Cards"))).click();
		
	}

}
