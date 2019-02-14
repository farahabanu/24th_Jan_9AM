package selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editboxes 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("https://www.cleartrip.com/");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		Thread.sleep(5000);
		
		
		//select radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		
		//Type referral code into editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);  //Timeout to receive suggesstions from DB
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();

		
		//type referral code into editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEl");
		Thread.sleep(4000);  //Timeout to receive suggesstions from DB
		driver.findElement(By.xpath("//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")).click();
		
		//select date from current month
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(3000);
		
		//Type Data into editbox --Only when it was writable
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Thu, 18 Jul, 2019");
		
		
		//Select number of adults traveling
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("3");
		
		//Select number of childrens traveling
		new Select(driver.findElement(By.id("Childrens")))
		.selectByVisibleText("2");
		
		//Click Moreoptions link
		driver.findElement(By.partialLinkText(" Class of travel, Airline preference")).click();
		Thread.sleep(3000);
		
		//select class of travel
		new Select(driver.findElement(By.xpath("//select[@name='class']")))
		.selectByVisibleText("Business");
		
		
		//Select travels
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("air asia");
		Thread.sleep(4000);  //Timeout to receive suggesstions from DB
		driver.findElement(By.xpath("//a[contains(.,'Air Asia (I5)')]")).click();
		
		//click button
		driver.findElement(By.xpath("//input[contains(@tabindex,'13')]")).click();
		
		
		
		
		
	}

}
