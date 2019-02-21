package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Attribute {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Scneario:-->
		 * 			Verifying multicity selection during flight search
		 * 			
		 * 			Given url http://makemytrip.com
		 * 			When click on mulicity tab
		 * 		 	Then receive Add city button visible at webpage
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		
		//Identify multicity Tab selection
		WebElement Multi_city=driver.findElement(By.xpath("//label[contains(.,'multi-city')]"));
		//Multi_city.click();
		
		
		//Get Runtime Attribute value usnig attribute name
		String Runtime_class=Multi_city.getAttribute("class");
		
		//write Decision to verify Multicity selection
		if(Runtime_class.contains("flight-trip-type"))
		{
			System.out.println("Multicity Selected");
			
			
			//Verify AddCity button visible at webpage
			WebElement AddCity_btn=driver.findElement(By.id("addModifyBtn"));
			if(AddCity_btn.isDisplayed())
				System.out.println("As expected Add city button visibel on multicity selection");
			else
				System.out.println("testfail Addcity button not visible at multicity selection");
			
			
		}
		else
			System.out.println("Multicity selection failed Scenarion Not validated");
		
		
		
		
		
		
		
		

	}

}
