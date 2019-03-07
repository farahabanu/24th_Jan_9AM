package keyboard_mouse_and_touch_interfaces;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class KeyBoard_interFaceClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		//Create keyboard interface on automation browser
		Keyboard key=((HasInputDevices)driver).getKeyboard();
		
		//Identify locationat webpage and click
		WebElement Exp_salary=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		Exp_salary.click();
		Thread.sleep(5000);
		
		key.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		Thread.sleep(3000);
		key.sendKeys(Keys.ENTER);
		
		
		
		

	}

}
