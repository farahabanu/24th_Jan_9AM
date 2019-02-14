package selenium_WebDriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_multiple_Selection {

	public static void main(String[] args) throws InterruptedException 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		//Identify dropdown multiple selection state
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Multiple Dropdown selection state is => "+flag);

		
		//using javascript convert single option dropdown to multiple selecion dropdown
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		//Identify dropdown multiple selection state
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Multiple Dropdown selection state is => "+flag1);

		
		//Select Multiple Dropdown options
		Select Multiple_selection=new Select(driver.findElement(By.id("open_account")));
		Multiple_selection.deselectAll();  //Clear all existing selections
		Multiple_selection.selectByIndex(1);		
		Multiple_selection.selectByIndex(3);
		Multiple_selection.selectByIndex(5);
		
		
		//Get selection count
		int Count=Multiple_selection.getAllSelectedOptions().size();
		System.out.println("Selection Count is => "+Count);
		
		
		//Deselect option from multiple selection
		Multiple_selection.deselectByIndex(3);
		
		
		//Get selection count
		int deselect_count=Multiple_selection.getAllSelectedOptions().size();
		System.out.println("Selection Count is After deselection=> "+deselect_count);
		
		
		/*
		 * note:--> Use deselection command only on multiple
		 * 			selection commands
		 */
		
		
	}

}
