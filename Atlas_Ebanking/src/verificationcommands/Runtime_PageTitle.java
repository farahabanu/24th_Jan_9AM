package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_PageTitle {

	public static void main(String[] args) 
	{
		
		//launch browser and load seleniumhq website
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		//Verify Expected title presented at Selenium homepage
		String Exp_title="Selenium - Web Browser Automation";
		
		//Capure current window title
		String Runtime_title=driver.getTitle();
		
		
		//Verify Eqaul comparision between expected and actual title
		boolean flag=Runtime_title.equals(Exp_title);
		
		
		if(flag==true)
		{
			System.out.println("SeleniumHQ title verified");
			
			WebElement Download_Tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
			Download_Tab.click();
			
			//verify title presented
			if(driver.getTitle().equals("Downloads"))
				System.out.println("Download page displayed");
			else
				System.out.println("Downlaod page title mismatch");
			
			
		}
		else
		{
			System.out.println("SeleniumHQ title Mismatch");
		}
		
		
	}

}
