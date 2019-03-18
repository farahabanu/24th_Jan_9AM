package datadriver_Framework;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDriven_Read_Testcase_From_Excel 
{
	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static String filepath="C:\\Users\\Administrator\\git\\24th_Jan_9AM\\Atlas_Ebanking\\src\\datadriver_Framework\\";
	static WebDriver driver;
	
	
    @Test
    public void Tc001_Verify_Email_Validation()
    {
    	String url=row.getCell(1).getStringCellValue();
		driver.get(url);
    	
    	String Signin_nav_btn=row.getCell(2).getStringCellValue();
    	driver.findElement(By.xpath(Signin_nav_btn)).click();
    	
    	//Get email location and input from excel
    	String email_locator=row.getCell(3).getStringCellValue();
    	String email_input=row.getCell(4).getStringCellValue();
    	driver.findElement(By.xpath(email_locator)).clear();
    	driver.findElement(By.xpath(email_locator)).sendKeys(email_input);
    	
    	//get Next button locator from excel
    	String Next_btn_locator=row.getCell(5).getStringCellValue();
    	driver.findElement(By.xpath(Next_btn_locator)).click();
    }
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		fi=new FileInputStream(filepath+"InputData.xlsx");
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet2");
		row=sht.getRow(1);
		
		//launch browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
		book.close();
	}
	
}
