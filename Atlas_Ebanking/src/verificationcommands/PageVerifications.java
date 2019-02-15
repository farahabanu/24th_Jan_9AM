package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageVerifications {

	public static void main(String[] args) 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Capture current window title
		String Runtime_title=driver.getTitle();
		System.out.println("current window title is => "+Runtime_title);

		//Capture current window url
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("current window url is => "+Runtime_url);
		
		//Capture current window dynamic ID
		String WindowID=driver.getWindowHandle();
		System.out.println("Runtime Window ID is => "+WindowID);
		
		//capture current page source
		String RuntimeSource=driver.getPageSource();
		System.out.println(RuntimeSource);
	}

}
