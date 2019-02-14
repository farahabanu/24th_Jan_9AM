package selenium_WebDriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");

		Thread.sleep(4000);   //Timeout to load City options
		
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");   //Option value property

		
		//Type locality
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("DSNR");
		
		Thread.sleep(4000);   //Timeout to load radius
		
		//Select By Index value
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);   //Option index -->Index starts with zero
		
		
		//Select checkbox
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		//Select checkbox
		driver.findElement(By.id("amenity_service_types48")).click();
		
		//click search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
