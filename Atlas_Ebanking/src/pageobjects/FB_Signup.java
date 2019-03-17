package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FB_Signup 
{
	
	//List out all Signup page objects
	
	@FindBy(how=How.ID,using="u_0_j")
	WebElement Firstname_EB;
	
	@FindBy(id="u_0_l")
	WebElement Surname_EB;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	WebElement Username_OR_Mobile_EB;
	
	@FindBy(xpath = "//input[@id='u_0_r']")
	WebElement RetypeEmail_EB;
	
	@FindBy(xpath = "//input[@id='u_0_v']")
	WebElement Password_EB;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	WebElement Day_DD;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	WebElement Month_DD;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	WebElement Year_DD;
	
	@FindBy(xpath = "//input[@value='1']")
	WebElement Female_Rbtn;
	
	@FindBy(xpath = "//input[@value='2']")
	WebElement Male_Rbtn;
	
	@FindBy(xpath = "//button[@name='websubmit']")
	WebElement Signin_Submit_btn;
	
	@FindBy(xpath="//ul[contains(@class,'pageFooterLinkList')]")
	WebElement Footer_links_area;
	
	@FindBy(how=How.TAG_NAME)
	List<WebElement> nav_links;
	

}
