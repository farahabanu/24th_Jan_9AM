package corejava.Variables.GlobalVariable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver=null;
	String url="http://facebook.com";
	String username=null;
	String password=null;
	
	By email_locator=By.id("email");
	By password_locator=By.id("pass");
	By signin_btn_locator=By.id("loginbutton");
	
	
	public void Launch_Browse()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void User_login()
	{
		WebElement username_editbox=driver.findElement(email_locator);
		username_editbox.clear();
		username_editbox.sendKeys(username);
		
		
		WebElement password_editbox=driver.findElement(password_locator);
		password_editbox.clear();
		password_editbox.sendKeys(password);
		
		WebElement Signin_btn=driver.findElement(signin_btn_locator);
		Signin_btn.click();
		
	}
	
	
	

}
