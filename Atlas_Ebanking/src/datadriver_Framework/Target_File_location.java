package datadriver_Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_File_location {

	public static void main(String[] args) throws IOException
	{
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		//Get Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("workbook accessed");
		
		
		
		
	}

}
