package corejava.decision_statement;

public class ElseIf_Statemenet {

	public static void main(String[] args) 
	{

		/*
		 * ElseIF:-->
		 * 		Multiple Decisions to Execute
		 */
		
		String browser="chrome";
		
		if(browser.equals("firefox"))
		{
			System.out.println("Firefox-executed");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("ie-executed");
		}
		else if(browser.equals("chrome"))
		{
			System.out.println("chrome-executed");
		}
		else
		{
			System.out.println("No browser match found");
		}
		

	}

}
