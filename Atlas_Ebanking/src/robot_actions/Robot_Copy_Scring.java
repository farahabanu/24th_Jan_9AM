package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Copy_Scring 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		//launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(4000);
	
		String text="Selenium automate web browser interfaces";
		//String selection
		StringSelection Stext=new StringSelection(text);
		//Get System clipboard at runtime
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipboard
		clipboard.setContents(Stext, Stext);
		
		//Create object for Robot..
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Paste using keyboard shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Save file into local system
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		//Release control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Set content to clipboard
		String path="D:\\sunill\\24th_Jan_9AM_2019\\Atlas_Ebanking\\input.txt";
		clipboard.setContents(new StringSelection(path), new StringSelection(path));
		
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
