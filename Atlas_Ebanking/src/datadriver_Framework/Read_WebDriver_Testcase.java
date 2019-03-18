package datadriver_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebDriver_Testcase 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Get Sheet acces using above book referal
		XSSFSheet sht=book.getSheet("Sheet2");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//using row get cell address
		String url=row.getCell(1).getStringCellValue();
		String Signin_nav_btn=row.getCell(2).getStringCellValue();
		String email_locator=row.getCell(3).getStringCellValue();
		String email_input=row.getCell(4).getStringCellValue();
		String next_btn=row.getCell(5).getStringCellValue();
		
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//click Signin navigation button to get login page
		driver.findElement(By.xpath(Signin_nav_btn)).click();
		
		//Enter email
		driver.findElement(By.xpath(email_locator)).clear();
		driver.findElement(By.xpath(email_locator)).sendKeys(email_input);

		//click Next button
		driver.findElement(By.xpath(next_btn)).click();
	}

}
