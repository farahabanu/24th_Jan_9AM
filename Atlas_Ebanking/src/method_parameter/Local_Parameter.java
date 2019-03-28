package method_parameter;

public class Local_Parameter 
{
	
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println("Toolname is => "+name);
	}
	
	//Method with Local parameter
	public void print_tool(String Tool_Name)
	{
		String name=Tool_Name;
		System.out.println("Toolname is => "+name);
	}
	
	//Method with multiple parameters
	public void print_tool(String Tool_Name,Double version)
	{
		String name=Tool_Name;
		System.out.println("Toolname is => "+name+" And Version is => "+version);
	}
	
	
	
	public static void main(String args[])
	{
		//Create object for class
		Local_Parameter obj=new Local_Parameter();
		
		//Calling method without argument
		obj.print_tool();
		
		//Calling method with argument
		obj.print_tool("IDE");
		
		//Calling method with multiple arguments
		obj.print_tool("GRID", 3.14);
	}

}
