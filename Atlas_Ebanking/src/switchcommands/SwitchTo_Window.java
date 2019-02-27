package switchcommands;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String MainWindowID=driver.getWindowHandle();
		
		//Click Instagram link
		WebElement Instagram=driver.findElement(By.linkText("Instagram"));
		Instagram.click();
		
		//Get All window ID's
		Set<String> AllWindowIDS=driver.getWindowHandles();
		//Apply foreach loop to itearate number of window times
		for (String EachwindowID : AllWindowIDS) 
		{
			if(!MainWindowID.equals(EachwindowID))
			{
				driver.switchTo().window(EachwindowID);
				break; //Stop iteration
			}
		}
		
		
		
		String Currnet_window_title=driver.getTitle();
		System.out.println(Currnet_window_title);
		
		Thread.sleep(5000);
		//Type text at instagram window
		WebElement Mobile=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Mobile.clear();
		Mobile.sendKeys("9030248855");
		Thread.sleep(5000);
		
		
		//Switch back controls to main window
		driver.switchTo().window(MainWindowID);
		System.out.println("Current window title is => "+driver.getTitle());
		
	}

}
