package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_VisibleText {

	public static void main(String[] args) throws Exception {
		
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
				
		//Identify page
		WebElement page=driver.findElement(By.tagName("body"));
		//Get text visible at webpage
		String Page_visible_text=page.getText();
		//System.out.println(Page_visible_text);
		
		
		String Expected_text="Couldn't find your Google Account";
		
		
		//Verify expected available at webpage
		if(Page_visible_text.contains(Expected_text))
			System.out.println("text visible at page");
		else
			System.out.println("text not visible at page");

	}

}
