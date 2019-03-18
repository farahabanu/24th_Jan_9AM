package datadriver_Framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Excel_User_Conditions 
{

	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static String filepath="C:\\Users\\Administrator\\git\\24th_Jan_9AM\\Atlas_Ebanking\\src\\datadriver_Framework\\";
	
	
	@Test
	public void Execute_Selected_Testcases()
	{
		
		 //Get Data available in number of rows
		int Row_count=sht.getLastRowNum();
		for (int i = 5; i <=Row_count; i++) 
		{
			
			//Get Dynamic row
			row=sht.getRow(i);
			
			//Get Execution Cell 
			String Exe_status=row.getCell(2).getStringCellValue();
			//Acception Condition on Execution status Yes
			if(Exe_status.equalsIgnoreCase("y"))
			{
				//Get Username and password from dynamic row
				String username=row.getCell(0).getStringCellValue();
				String password=row.getCell(1).getStringCellValue();
				
				System.out.println(username+"  "+password);
				
				
				//Get Scenario type
				String stype=row.getCell(3).getStringCellValue();
				if(stype.equals("text"))
				{
					System.out.println("text captured  for => "+username);
				}
				else if(stype.equals("alert"))
				{
					System.out.println("alet handled  for => "+username);
				}
				else if(stype.equals("p"))
				{
					System.out.println("positive output captured for => "+username);
				}
				else if(stype.equals("n"))
				{
					System.out.println("negative output captured for => "+username);
				}
				else
					System.out.println("Scenario type mismatch in excel  => "+username);
			}
			
		}
		
	}
	
	
	
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		fi=new FileInputStream(filepath+"InputData.xlsx");
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet4");
		
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		book.close();
	}
	

}
