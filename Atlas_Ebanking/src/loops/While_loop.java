package loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_loop {

	public static void main(String[] args) throws InterruptedException 
	{
		
		/*
		 * While:-->
		 * 		=> While loop is a condition based loop,It Start
		 * 			iteration when condition return true and Continue
		 * 			iteration when condition return false.
		 * 
		 * 		=> In while condition loop we must increment loop
		 * 			manually to stop iteration.
		 * 
		 */
		
		
		int i=0;
		while(i < 20)
		{
			i=i+1;
			System.out.println(i);
		}
		
		
		
		
		//set timeout using while loop
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		/*WebElement Email_editbox=driver.findElement(By.id("email"));
		
		//Write condition loop to iterata untile email disabled
		while(Email_editbox.isEnabled())
		{
			System.out.println("Editbox is enabled");
		}
		
		System.out.println("timeout released");*/
		
		
		
		WebElement RetypeEmail=driver.findElement(By.id("u_0_r"));
		int j=0;
		//Write condition loop to iterate until element visible at webpage
		while(!RetypeEmail.isDisplayed())
		{
			System.out.println("Editbox Not displayed");
			Thread.sleep(5000);
			j=j+1;
			
			if(j==50)
			 break;
		}
		
		System.out.println("Editbox is displayd at webpage");
		
		
		

	}

}
