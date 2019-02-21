package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Editbox_InputValue {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify email editbox
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("9030248855");
		
		
		//Get Editox input value at runtime
		String input=email.getAttribute("value");
		System.out.println(input);
		
		
		if(!input.isEmpty())
			System.out.println("Text type done");
		else
			System.out.println("failed to type text");
		
		
		
		

	}

}
