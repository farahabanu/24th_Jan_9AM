package selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_And_PartialLinktext 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("http://cleartrip.com");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		//Click link using original linkname
		driver.findElement(By.linkText("About Us")).click();
		
		//click link using original linkname
		driver.findElement(By.linkText("Jobs")).click();

		//click link using original linkname
		driver.findElement(By.linkText("Job Openings")).click();
		
		//click link using partiallinktext
		driver.findElement(By.partialLinkText("Senior Executive-Agency Sales")).click();
	}

}
