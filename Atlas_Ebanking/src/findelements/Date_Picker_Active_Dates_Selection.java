package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Active_Dates_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Identify location
		WebElement Departure_date=driver.findElement(By.xpath("//input[@id='dpt_date']"));
		Departure_date.click();
		Thread.sleep(2000);
		
		//Iterate for 4 times to click Next_Month button
		for (int i = 1; i <= 4; i++) 
		{
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			//Get List of links under active month
			List<WebElement> All_active_links;
			All_active_links=Active_month.findElements(By.tagName("a"));
			
			//Iterate for number of links
			for (int j = 0; j < All_active_links.size(); j++) 
			{
				//Get Each link
				All_active_links.get(j).click();
				Thread.sleep(1000);
				
				//Open calendar
				Departure_date.click();
				
				//Restore all links
				Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				All_active_links=Active_month.findElements(By.tagName("a"));
			}
			
			
			
			
			
			
			WebElement Next_month_btn=driver.findElement(By.xpath("//a[@title='Next month']"));
			Next_month_btn.click();
			Thread.sleep(3000);
		}
		
		
		
		

	}

}
