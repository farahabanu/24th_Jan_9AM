package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Dropdown_Option_Selection 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Write a program to select all dropdown options
		 *	using findelements option.
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identify dropdown
		WebElement Month_dropdown=driver.findElement(By.id("month"));
		
		//ON Dropdown identify list of option tags
		List<WebElement> All_Options=Month_dropdown.findElements(By.tagName("option"));
		
		//Get Count of dropdown options
		int count=All_Options.size();
		System.out.println("Dropdown Count is => "+count);
		
		//Applying for loop to iterate expected range
		for (int i = 1; i < count; i++) 
		{
			//Get Each option using index number.
			WebElement Eachoption=All_Options.get(i);
			System.out.println(Eachoption.getText());
			Eachoption.click();
			
		}

	}

}
