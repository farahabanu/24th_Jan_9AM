package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_New_Window_Using_Target_property {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://telanganaepass.cgg.gov.in/");
		driver.manage().window().maximize();
		
		
		WebElement External_link=driver.findElement(By.xpath("//a[contains(.,'RTI Manual')]"));
		External_link.click();
		
		/*
		 * External link source:-->
		 * 		<a href="SCDD-RTIManual.pdf" target="new">RTI Manual</a>
		 * 
		 * 		Note:--> External link target attribute value to switch
		 * 				external window.
		 * 
		 * 	Note:--> Where target property is "_blank" don't
		 * 			use to switch fo external window
		 */
		driver.switchTo().window("new");
		System.out.println("Current window url is => "+driver.getCurrentUrl());
		
		

	}

}
