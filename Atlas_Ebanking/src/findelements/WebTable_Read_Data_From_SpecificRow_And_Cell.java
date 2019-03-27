package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Read_Data_From_SpecificRow_And_Cell 
{

	public static void main(String[] args) 
	{
		
		/*
		 * FAQ:--> Read data from webtable using specific Row 
		 * 				and specific Cell..
		 */

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identif markets link
		WebElement Markets_link=driver.findElement(By.xpath("(//a[contains(.,'markets')])[1]"));
		Markets_link.click();
		
		//Idetnfiy Webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='dvToplooser']/table"));
		
		//Using tr tag identify list of rows under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Identify specific row using list interface
		WebElement Selected_Row=rows.get(3);
		
		//USing selected row find list of cells available
		List<WebElement> cells=Selected_Row.findElements(By.tagName("td"));
		
		//Using list get selected cell values 
		String Company_Name=cells.get(0).getText();
		String High_Price=cells.get(3).getText();
		
		System.out.println(Company_Name+"    "+High_Price);

	}

}
