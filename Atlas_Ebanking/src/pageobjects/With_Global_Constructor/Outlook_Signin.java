package pageobjects.With_Global_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Outlook_Signin 
{

	public Outlook_Signin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='linkButtonSigninHeader']")
	WebElement Signin_btn;
	
	@FindBy(xpath = "//input[@name='loginfmt']")
	WebElement Email_EB;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Email_next_btn;
	
	@FindBy(xpath = "//input[@name='passwd']")
	WebElement password_EB;
	
	@FindBy(xpath = "//input[@value='Sign in']")
	WebElement login_submit_btn;
	
	@FindBy(xpath = "//input[@name='KMSI']")
	WebElement keepme_signin_CB;
	
	@FindBy(xpath = "//div[@id='usernameError']")
	WebElement Invalid_Domain_error_msg;
	
	

}
