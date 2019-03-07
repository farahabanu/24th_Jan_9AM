package sikuli_automation;

import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Desktop_Automation
{

	public static void main(String[] args) throws SikuliException, Exception
	{
		String imagepath="D:\\sunill\\24th_Jan_9AM_2019\\Atlas_Ebanking\\screens\\";
		
		Thread.sleep(5000);
		//Create object for sikuli
		Screen sikuli=new Screen();
		
	    //Double click on image
		sikuli.doubleClick(imagepath+"FICON.png");
		Thread.sleep(4000);
		
		//Type text into editbox
		sikuli.type(imagepath+"Search.png", "Selenium");
		Thread.sleep(4000);
		
		
		//click on button
		sikuli.click(imagepath+"Go.png");
		Thread.sleep(4000);
		
		//Click link
		sikuli.findText("Books").click();
		Thread.sleep(4000);
		
		
		
		
		
	}

}
