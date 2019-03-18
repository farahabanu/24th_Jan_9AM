package datadriver_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		
		String filepath="C:\\Users\\Administrator\\git\\24th_Jan_9AM\\Atlas_Ebanking\\src\\datadriver_Framework\\";
		//Target file location
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using sheetname
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Targe row using index number
		XSSFRow row=sht.getRow(1);
		
		//Identify cell using row referral
		XSSFCell cell=row.getCell(0);
		
		//Get Data from cell w.r.t avaiable format
		String Appurl=cell.getStringCellValue();
		System.out.println(Appurl);
		
		//using first row referal get cell value
		String CustomerID=row.getCell(1).getStringCellValue();
		System.out.println(CustomerID);
		
		
		/*
		 * Note:--> Read Data from Numeric cell
		 */
		Double Mobile=row.getCell(3).getNumericCellValue();
		System.out.println("Mobile num is double format is => "+Mobile);
		System.out.println("Mobile num in long format is => "+Mobile.longValue());
		
		
		/*
		 * Numeric value convert to String format
		 */
		String Mobile_num=NumberToTextConverter.toText(Mobile);
		System.out.println("mobile number is string format => "+Mobile_num);
		
		
	}

}
