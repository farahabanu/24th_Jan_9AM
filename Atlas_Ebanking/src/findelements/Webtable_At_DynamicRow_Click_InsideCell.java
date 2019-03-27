package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_At_DynamicRow_Click_InsideCell 
{

	public static void main(String[] args) throws Exception
	{
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identif markets link
		WebElement Markets_link=driver.findElement(By.xpath("(//a[contains(.,'markets')])[1]"));
		Markets_link.click();
		
		//Idetnfiy Webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
				
		//Using tr tag identify list of rows under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
				
		//Size of TR tages
		int Rcount=rows.size();
		
		boolean flag=false;
		//Iterate Number of rows
		for (int i = 1; i < Rcount; i++)
		{
			//Target Dynamic Row
			WebElement DynamicRow=rows.get(i);
			
			//Target Each dynamic row and get text from it
			String Row_Text=DynamicRow.getText();
			
			//Condition to accept only on selected record found
			if(Row_Text.contains("TATMOT"))
			{
				flag=true;
				//USing Dynamic row find list of cells available
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target News Cell
				cells.get(7).findElement(By.tagName("a")).click();
				break;  //To avoid stale-element-reference-exception stop iteration
			}
			
		
		}//
		
		System.out.println("Record available status is => "+flag);
		
		Thread.sleep(5000);
		if(flag==true)
		{
			//Read News records
			WebElement News_Table=driver.findElement(By.xpath("//div[@id='tinydata']/table"));
			String News=News_Table.getText();
			System.out.println(News);
		}
		
		
	}

}
