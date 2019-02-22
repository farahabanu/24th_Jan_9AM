package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_ContentDisplay_At_TreeView 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Home/CorporateService.aspx");
		driver.manage().window().maximize();
		
		
		WebElement Resources=driver.findElement(By.xpath("//a[contains(.,'Resources')]"));
		//Resources.click();
		Thread.sleep(5000);
		
		//Verify Expected link visible at tree view
		WebElement Money_Manager=driver.findElement(By.xpath("//a[@title='Money manager']"));
		if(Money_Manager.isDisplayed())
			System.out.println("Tree view expanded and requied link dispayed");
		else
			System.out.println("Failed expected link not visible at webpage");
		
		
		

	}

}
