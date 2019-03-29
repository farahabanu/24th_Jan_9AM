package method_parameter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class SwitchTo_Window extends Repository
{

	@Test
	public void SwitchToWindow()
	{
		Click_element(By.xpath("//a[@href='/htdocs/common/agri/index.html']"));
		switchto_window("Dhan Vikas e-Kendra");
		capture_screenshot("Agri vikas e-kendra");
		
		switchto_window("Personal Banking");
		capture_screenshot("personal banking from Agri vikas");
	
	}
	
	
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		launch_browser("chrome");
		load_webpage("https://www.hdfcbank.com/");
		set_timeout(50);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.quit();  //global variable from repository
		
	}


}
