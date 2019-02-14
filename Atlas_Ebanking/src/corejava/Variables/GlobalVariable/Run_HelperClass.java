package corejava.Variables.GlobalVariable;

public class Run_HelperClass 
{

	public static void main(String[] args) 
	{
		
		//Create object for helper class
		Helper obj=new Helper();
		obj.Launch_Browse();
		
		//Assign user data from runtime
		obj.username="9030248855";
		obj.password="hello12345";
		obj.User_login();

	}

}
