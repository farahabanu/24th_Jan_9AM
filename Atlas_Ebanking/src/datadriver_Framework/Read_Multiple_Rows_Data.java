package datadriver_Framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Read_Multiple_Rows_Data 
{
	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static String filepath="C:\\Users\\Administrator\\git\\24th_Jan_9AM\\Atlas_Ebanking\\src\\datadriver_Framework\\";
	
	
	
	
	@Test
	public void Test_ReadData_From_multipleRows()
	{
		
		  //Get Data available in number of rows
		  int Row_Count=sht.getLastRowNum();
		  System.out.println("Data available in number of rows is => "+Row_Count);
		  //using for loop iterate for expected range
		  for (int i = 5; i <= Row_Count; i++) 
		  {
			    //target Each Dynamic row
			    row=sht.getRow(i);
			    
			    //Get Dynamic Cell Data
			    String username=row.getCell(0).getStringCellValue();
			    String password=row.getCell(1).getStringCellValue();
			    
			    System.out.println(username+"  "+password);
		  }
		
		
	}
	
	
	
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		fi=new FileInputStream(filepath+"InputData.xlsx");
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet3");
		
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		book.close();
	}
	
}
