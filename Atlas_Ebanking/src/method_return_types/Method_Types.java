package method_return_types;

public class Method_Types 
{
	//Void doesn't return value
	public void method1()
	{
		String name="WebDriver";
	}
	
	//Return value to methodname
	public String method2()
	{
		String name="IDE";
		return name;
		
	}
	
	
	public int method3(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	
	/*
	 * Note:-->
	 * 		=> Otherthan void for all methods we should write
	 * 			return keyword.
	 * 		=> Return keyword should match with return type
	 * 		=> finaly it return value to methodname.
	 */
	
	
	
	
	public static void main(String[] args) 
	{
		
		//Create object for Method tyeps
		Method_Types obj=new Method_Types();
		
		//Calling void method
		obj.method1();
		
		//Calling return type method
		String toolname=obj.method2();
		System.out.println("toolname is "+toolname);
		
		//Calling return type method
		int total=obj.method3(100,200);
		System.out.println("total value is => "+total);

	}

}
