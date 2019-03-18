package datadriver_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTestcase_With_MultipleData {

	public static void main(String[] args) throws IOException {
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Get Sheet acces using above book referal
		XSSFSheet sht=book.getSheet("Sheet3");
		
		
		//Get number of rows data availabel under sheet
		int FRcount=sht.getFirstRowNum();
		int LRcount=sht.getLastRowNum();
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Iterate for expected range
		for (int i = 5; i <= LRcount; i++) 
		{
			//target row
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"  "+password);
			
			//get url from excel
			String url=sht.getRow(0).getCell(1).getStringCellValue();
			driver.get(url);
			
			//Get username locator from excel
			String username_locator=sht.getRow(1).getCell(1).getStringCellValue();
			driver.findElement(By.xpath(username_locator)).clear();
			driver.findElement(By.xpath(username_locator)).sendKeys(username);
			
			//Get password locator from excel
			String password_locator=sht.getRow(2).getCell(1).getStringCellValue();
			driver.findElement(By.xpath(password_locator)).clear();
			driver.findElement(By.xpath(password_locator)).sendKeys(password);
			
			//Get Signin button locator from excel
			String signin_btn=sht.getRow(3).getCell(1).getStringCellValue();
			driver.findElement(By.xpath(signin_btn)).click();
		}
				

	}

}
