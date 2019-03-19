package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting_Syntax 
{

	public static void main(String[] args) 
	{
		
		//Target file location
		String filepath="D:\\sunill\\24th_Jan_9AM_2019\\Extent_reports\\";
		//Create object for Extent Reports
		ExtentReports logger=new ExtentReports(filepath+"TestReport.html", true);
		
		
		ExtentTest test1=logger.startTest("Tc001_Login_valid_Data");
		
		
			test1.log(LogStatus.INFO, "I test info");
			test1.log(LogStatus.PASS, "I test pass");
			test1.log(LogStatus.FAIL, "I test fail");
			test1.log(LogStatus.SKIP, "I test skip");
			test1.log(LogStatus.WARNING, "I test warn");
			test1.log(LogStatus.FATAL, "I test fatal");
		
		logger.endTest(test1);
		
		
		
		
		logger.flush();  //Write Data to file
		
		
		
		

	}

}
