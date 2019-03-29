package method_return_types;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	/*
	 * keywordname:--> Launch diff browsers
	 * Author:--> Sunil
	 * CreatedDate:--> 3/28/2019
	 * UpdatedDate:-->
	 * Parameters-used:-->  Local[Method parameters]
	 * ReviewedBy:--> Mindq team
	 */
	 public static void launch_browser(String browsername)
	 {
		 switch (browsername) 
		 {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
	
		case "ie":
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("browser mismatch");
			
			break;
		}
	 }
	
	
	
	 /*
	 * keywordname:--> Load diff webpage
	 * Author:-->
	 * CreatedDate:-->
	 * UpdatedDate:-->
	 * LocalParametersused:-->
	 * ReviewedBy:-->
	 */
	public static void load_webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
		
	
	/*
	 * keywordname:--> set implicit and explicit timegap
	 * Author:-->
	 * CreatedDate:-->
	 * UpdatedDate:-->
	 * LocalParametersused:-->
	 * ReviewedBy:-->
	 */
	public static void set_timeout(int time_in_sec)
	{
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
		
		//object creation for explicit wait
		wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	/*
	 * keywordname:--> Enter text into editbox [Identification only with xpath]
	 * Author:-->
	 * CreatedDate:-->
	 * UpdatedDate:-->
	 * LocalParametersused:-->
	 * ReviewedBy:-->
	 */
	public void Enter_text(String Element_Xpath,String input)
	{
		//identify location
		WebElement Editbox=driver.findElement(By.xpath(Element_Xpath));
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	
	/*
	 * keywordname:--> Enter text into editbox[Using any locator]
	 * Author:-->
	 * CreatedDate:-->
	 * UpdatedDate:-->
	 * LocalParametersused:-->
	 * ReviewedBy:-->
	 */
	public void Enter_text(By locator,String input)
	{
		//identify location
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Editbox.clear();
		Editbox.sendKeys(input);
		
	}
	
	
	/*
	 * MethodName:--> Select Dropdown using optioname
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Select_dropdown(By locator, String Option_name)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Select(Dropdown).selectByVisibleText(Option_name);
	}
	
	/*
	 * MethodName:--> Click Element [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Click_element(By locator)
	{
		driver.findElement(locator).click();
	}
	
	
	/*
	 * MethodName:--> waitandclick [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Wait_and_click(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	
	/*
	 * MethodName:--> waitforElementto visisble
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void wait_for_Element_visible(By locator)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	/*
	 * MethodName:-->Mouse hover on element
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).moveToElement(Element).perform();
	}
	
	
	/*
	 * MethodName:-->Switch to Window using title name
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void switchto_window(String window_title)
	{
		//Get All window Dynamic ID's Open throw webdriver.
		Set<String> AllwindowIDS=driver.getWindowHandles();
		//Apply foreach loop
		for (String Eachwindow : AllwindowIDS) 
		{
			//Apply switch to all window iteation wise
			driver.switchTo().window(Eachwindow);
			//Capture runtime title of each window
			String Runtime_title=driver.getTitle();
			
			//Where runtime title matches with expected title accept condition
			if(Runtime_title.contains(window_title))
			{
				break;  //break iteration
			}
			
		}
	}
	

	
	/*
	 * MethodName:-->Capture screenshot along with time stamp
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void capture_screenshot(String imagename)
	{
		//Create object for date
		Date d=new Date();
		//Create simple date foramatter
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//using simpel date foramt convert date
		String time=sdf.format(d);
		
		
		try {
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	//==============user-defined-keywords============
	
	/*
	 * MethodName:-->Verify title presented at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public boolean isTitle_presented(String Exp_title)
	{
		try {
			boolean flag=wait.until(ExpectedConditions.titleContains(Exp_title));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
		
	}
	
	/*
	 * MethodName:-->Verify url presented at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public boolean isurl_presented(String Exp_url)
	{
		try {
			boolean flag=wait.until(ExpectedConditions.urlContains(Exp_url));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
		
	}
	
	
	
	/*
	 * MethodName:-->Verify text visible at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public boolean Verify_text_visible(String Exp_text)
	{
		WebElement Page=driver.findElement(By.tagName("body"));
		String page_visible_text=Page.getText();
		boolean flag=page_visible_text.contains(Exp_text);
		return flag;
	}
	
	
	/*
	 * MethodName:-->Verify text visible at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public boolean Verify_text_presentedAt_element(By locator,String text)
	{
		boolean flag=wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
		return flag;
	}
	
	
}
