package sikuli_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Web_Automation_Upload_Functionality {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@value='exp']")).click();
		Thread.sleep(3000);
		
		WebElement Upload_resume=driver.findElement(By.xpath("/html/body/main/div/div/form/resman-uploader/div/div[1]/span[1]/input"));
		Upload_resume.click();
		Thread.sleep(5000);
		
		//Create object for sikuli
		String imagepath="D:\\sunill\\24th_Jan_9AM_2019\\Atlas_Ebanking\\screens\\";
		Screen sikuli=new Screen();
		sikuli.type(imagepath+"Enter_path.png", "C:\\Users\\Administrator\\Downloads\\Sunil.docx");
		Thread.sleep(5000);
		
		//Click Open button
		sikuli.click(imagepath+"Open.png");
	}

}
