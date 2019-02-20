package verificationcommands;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Selected_Element_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->  Gmail login with invalid domain-name
		 * 
		 * 		Given valid url http://gmail.com
		 * 		When enter username with invalid domain address
		 * 		And click on Next button
		 * 		Then receive Expected Error  msg.
		 * 		
		 */
		
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//identify location
		WebElement Username=driver.findElement(By.id("identifierId"));
		Username.clear();
		Username.sendKeys("qadarshan@outlook.com");
		
		//Click Next button
		WebElement Next_btn=driver.findElement(By.xpath("//content[contains(.,'Next')]"));
		Next_btn.click();
		Thread.sleep(4000);
		
		
		//Identify error location
		WebElement Error_location=driver.findElement(By.xpath("//div[@class='GQ8Pzc']"));
		//Capture text at location
		String Runtime_text=Error_location.getText();
		
		
		String Expected_text="Couldn't find your Google Account";
		
		
		//Verify Text visible at webpage
		if(!Runtime_text.isEmpty())
		{
			System.out.println("Text visible at webpage");
			
			//Verify equal comparision between two strings
			if(Runtime_text.equals(Expected_text))
				System.out.println("Text match as expected");
			else
				System.out.println("text mismatch");
		}
		else
		{
			System.out.println("Text not visible at webpage");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
