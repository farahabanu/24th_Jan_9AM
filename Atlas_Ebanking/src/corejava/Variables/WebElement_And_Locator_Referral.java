package corejava.Variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_And_Locator_Referral 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("https://www.facebook.com/");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		Thread.sleep(5000);
		
		
		//Identify email editbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Identify password editbox
		WebElement password_editbox=driver.findElement(By.id("pass"));
		password_editbox.clear();
		password_editbox.sendKeys("Hello123456");
		
		//identify login button
		By login_btn_locator=By.id("loginbutton");
		//Identify WebElement
		WebElement Login_btn=driver.findElement(login_btn_locator);
		Login_btn.click();
		
		
		
	}

}
