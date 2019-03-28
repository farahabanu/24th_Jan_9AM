package method_parameter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class Run_Repository extends Repository
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		launch_browser("chrome");
		load_webpage("http://facebook.com");
		set_timeout(50);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();  //global variable from repository
		
	}

	@Test
	public void User_Registarton() 
	{
		Enter_text("//input[@aria-label='First name']", "Newuser");
		Enter_text("//input[@name='lastname']", "WebDriver");
		
		//Enter text using Locator class along with timegap
		Enter_text(By.id("u_0_o"), "NewuserWebDriver@gmail.com");
		Enter_text(By.xpath("//input[@id='u_0_r']"),"NewuserWebDriver@gmail.com");
		Enter_text(By.cssSelector("#u_0_v"), "Hello123456");
		
		//select Dropdown locator along with explicit wait
		Select_dropdown(By.id("day"), "29");
		Select_dropdown(By.id("month"), "Dec");
		Select_dropdown(By.id("year"), "1990");
		
		//Click radio button 
		Click_element(By.xpath("//input[@value='1']"));
		
	}
	
	
	
	
	

}
