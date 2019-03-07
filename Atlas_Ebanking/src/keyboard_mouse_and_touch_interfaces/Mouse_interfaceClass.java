package keyboard_mouse_and_touch_interfaces;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;

public class Mouse_interfaceClass 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Enable mouse interface on automation browser
		Mouse mouse=((HasInputDevices)driver).getMouse();
	
		//Identify location before hover
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		//Get elemnet Coordinates
		Coordinates Obj_Co=((Locatable)Category).getCoordinates();
		//Peform mouse hover action on location
		mouse.mouseMove(Obj_Co);
		
		
		//Identify location
		WebElement Mobiles=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		//hover on location
		mouse.mouseMove(((Locatable)Mobiles).getCoordinates());
		
		//Target location
		WebElement Laptops=driver.findElement(By.xpath("//span[contains(.,'Laptops')]"));
		mouse.click(((Locatable)Laptops).getCoordinates());
	}

}
