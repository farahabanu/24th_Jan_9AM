package javascript;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Make_myTrip 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		
		//click Return date
		driver.findElement(By.id("hp-widget__return")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
	   ((JavascriptExecutor)driver).executeScript("window.scroll(200,100)");
	   Thread.sleep(10000);
	   
		//Select Next month
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[4]/div/div[2]/div/a/span"))).click();
	  
	    
	}

}
