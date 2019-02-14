package selenium_WebDriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Multiple_Selection_of_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown Multiple selection state is => "+flag);

		
		//Using javascript convert Single option dropdown to multiple selection dropdown
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(3000);
		
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown Multiple selection state is => "+flag1);

		
		//Select Multiple Options at combobox.
		Select Open_account=new Select(driver.findElement(By.id("open_account")));
		Open_account.deselectAll();
		Open_account.selectByVisibleText("Investment Account");
		Open_account.selectByVisibleText("Financial Learning Programmes");
		Open_account.selectByIndex(3);
		Open_account.selectByIndex(4);
		
		int count=Open_account.getAllSelectedOptions().size();
		
		if(count > 3)
		{
			System.out.println("Test fail selected more than 3 options");
		}
	}

}
