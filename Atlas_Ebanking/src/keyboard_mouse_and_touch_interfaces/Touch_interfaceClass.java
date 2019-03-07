package keyboard_mouse_and_touch_interfaces;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.internal.Coordinates;

public class Touch_interfaceClass {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		/*
		 * Blog to read touch actions:
		 * 	https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/interactions/touch/TouchActions.html
		 */
		
		//Enable Touch actions on automation browser
		TouchScreen touch=((HasTouchScreen)driver).getTouch();

		//Identify location and perform single tap action
		WebElement Exp_salary=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		//Get Element coordinates
		Coordinates Exp_sal_coord=((Locatable)Exp_salary).getCoordinates();
		//Performe single tap action
		touch.singleTap(Exp_sal_coord);
		
		
		
		
	}

}
