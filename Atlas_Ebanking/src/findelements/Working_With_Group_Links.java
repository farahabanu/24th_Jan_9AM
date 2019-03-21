package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Group_Links {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> Identify group links at webpage. And
		 * 		operate each link using iterations.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		//identify location of page links
		WebElement Page_links_location;
		Page_links_location=driver.findElement(By.cssSelector("div[class='jCqS _19iN'][data-reactid='252']"));
		//Find all links under page-links-location
		List<WebElement> All_links;
		All_links=Page_links_location.findElements(By.tagName("a"));
		
		//Iterate for number of links
		for (int i = 0; i < All_links.size(); i++) 
		{
			 //Target Each link
			WebElement Eachlink=All_links.get(i);
			
			//Get linkname and href attribute
			String Linkname=Eachlink.getText();
			String Link_href=Eachlink.getAttribute("href");
			
			System.out.println(Linkname+"   "+Link_href);
			
			//click eachlink
			Eachlink.click();
			Thread.sleep(4000);
			
			
			driver.navigate().back();
			Thread.sleep(4000);
			
			//Restore all links to avoid StaleElementReference-Exception.
			Page_links_location=driver.findElement(By.cssSelector("div[class='jCqS _19iN'][data-reactid='252']"));
			All_links=Page_links_location.findElements(By.tagName("a"));
		}
		
		
		
		
	}

}
