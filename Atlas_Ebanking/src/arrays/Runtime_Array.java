package arrays;

public class Runtime_Array {

	public static void main(String[] args) 
	{
		
		/*
		 * RuntimeArray:-->
		 * 		All events in runtime array allocated dynamically
		 * 		in index order.
		 */

		String browser[]={"firefox","chrome","ie","safari","opera"};
		//Count of events in runtime array
		int len=browser.length;
		System.out.println("Total number of events are => "+len);
		
		//get second index value at runtime array
		System.out.println("2nd index value is => "+browser[2]);
		
		
		//Integer array
		int num[]={100,200,300,400};
		System.out.println("First index value is => "+num[1]);
		
		
		
	}

}
