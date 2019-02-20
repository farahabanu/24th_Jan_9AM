package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Using_Area 
{

	public static void main(String[] args)
	{
		//Verify required option available at droppdown
		
		//Capture Page visible Text..
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//identify dropdown location
		WebElement State_dropdown=driver.findElement(By.id("customState"));
		//get list of option text with in dropdown
		String States_list=State_dropdown.getText();
		
		
		if(States_list.contains("Telangana"))
			System.out.println("Required state available at dropdown");
		else
			System.out.println("Statename not available at dropdown");
	}

}
