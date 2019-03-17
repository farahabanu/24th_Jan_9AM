package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visibility_of_Element_Located 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("http://gmail.com");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		//Identify email location and enter text
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com");
		
		//Identify password locator
		By password_locator=By.name("password");
		
		//Create Object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement password_editbox=wait.until(ExpectedConditions.
				visibilityOfElementLocated(password_locator));
		
		//Type text into password editbox
		password_editbox.clear();
		password_editbox.sendKeys("Hello123456",Keys.ENTER);
		
		
		
		
	}

}
