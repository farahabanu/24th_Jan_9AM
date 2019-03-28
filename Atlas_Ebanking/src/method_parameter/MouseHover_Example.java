package method_parameter;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class MouseHover_Example extends Repository
{

	
	@Test
	public void Verify_mouseHover() 
	{
		MouseHover(By.xpath("//a[@href='/personal/products']"));
		MouseHover(By.xpath("//a[@href='/personal/products/cards']"));
		Wait_and_click(By.xpath("//a[contains(.,'Debit Cards')]"));
	}
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		launch_browser("chrome");
		load_webpage("https://www.hdfcbank.com/");
		set_timeout(20);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
		Thread.sleep(5000);
		driver.close();
	}


}
