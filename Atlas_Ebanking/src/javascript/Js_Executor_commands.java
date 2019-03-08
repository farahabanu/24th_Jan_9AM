package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox using javascript
		js.executeScript("document.getElementById('u_0_j').value='Sam'");
		js.executeScript("document.getElementById('u_0_l').value='Newuser'");
		
		//Javascript executor using xpath
		WebElement Day_Dropdown=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		js.executeScript("arguments[0].value='6'", Day_Dropdown);
		
		WebElement Month_Dropdown=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		js.executeScript("arguments[0].value='5'", Month_Dropdown);
		
		//select radio button
		WebElement Female_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
		js.executeScript("arguments[0].click()",Female_radio_btn);
		Thread.sleep(4000);
				
		//select radio button
		WebElement male_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		js.executeScript("arguments[0].checked=true",male_radio_btn);
				
				
		
		
		
		
		
		
	}
}
