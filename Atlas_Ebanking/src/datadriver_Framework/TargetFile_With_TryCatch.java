package datadriver_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TargetFile_With_TryCatch 
{

	public static void main(String[] args) 
	{
		
		
		//Target file location
		try {
			
			FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
			System.out.println("file located");
			
			//Access workbook
			XSSFWorkbook book=new XSSFWorkbook(fi);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//It Resume your run after catching exception..
		System.out.println("Run continued");
		
	}

}
