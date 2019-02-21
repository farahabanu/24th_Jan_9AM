package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_CssValue {

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
		
		
		
		String element_color=Multi_city.getCssValue("color");
		System.out.println(element_color);
		
		
		String Exp_color="rgba(22, 72, 128, 1)";
		
		if(element_color.equals(Exp_color))
			System.out.println("multicity tab selected");
		else
			System.out.println("tab selection failed");
		

	}

}
