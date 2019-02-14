package browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firfox_browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * download geckodriver to initiate firefox browser.
		 * 
		 * 		=> Url--> https://www.seleniumhq.org/download/
		 * 		=> Under thirdpaty browser drivers click on
		 * 				mozilla GeckoDriver.
		 * 		=> URL---> https://github.com/mozilla/geckodriver/releases
		 * 		=> download latest version  [v0.24.0    --> 65 browser version]
		 * 		=> download zip format file w.r.t OS
		 * 		=> After completed download unzip file
		 * 		=> And copy to project location..
		 */
		
		
		/*Note--> No need provide entire file path when  
		file available under project*/
		
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  //launch browser
		driver.get("http://google.com");       //Load webpage
		
	}

}
