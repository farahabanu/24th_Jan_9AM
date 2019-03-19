package arrays;

public class Array_Syntax 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Array:-->
		 * 		Collection of similar events, Array use to
		 * 		store set of values into single variable.
		 * 
		 * 		1. Static Array
		 * 		2. Runtime Array
		 */
		
		//StaticArray:--> Store set of similar events using boundary index.
		String arr[]=new String[5];
		arr[0]="IDE";
		arr[1]="RC";
		arr[2]="WD";
		arr[3]="GRID";
		arr[4]="Appium";
		
		
		int len=arr.length;
		System.out.println("Total number of boundaries are => "+len);
		
		System.out.println("2nd Index value in array is => "+arr[2]);
		
		
		
		
		

	}

}
