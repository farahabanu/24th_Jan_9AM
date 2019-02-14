package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chromeBrowser 
{

	public static void main(String[] args) 
	{
		
		/*
		 *   download chromedriver 
		 *   
		 *   	URl=> https://chromedriver.storage.googleapis.com/index.html?path=2.45/
		 *   	Download zip format file to backup folder
		 *   	unzip file [we receive chromedriver.exe file]
		 *   	Copy chromedriver.exe file to project..
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("http://facebook.com");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("hello12345");
		
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
