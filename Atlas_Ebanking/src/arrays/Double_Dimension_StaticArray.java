package arrays;

public class Double_Dimension_StaticArray 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Double dimension Array:-->
		 * 			Store set of events into single variable
		 * 			using table format.
		 */
		
		
		//Static-Boundaries
		String data[][]=new String[4][2];
		
		//1st row data
		data[0][0]="user1";
		data[0][1]="pwd1";
		
		//2st row data
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		//3st row data
		data[2][0]="user3";
		data[2][1]="pwd3";
		
		//4st row data
		data[3][0]="user4";
		data[3][1]="pwd4";
		
		
		//get length of array
		int len=data.length;
		System.out.println("size of array is => "+len);
		
		System.out.println("3rd row 1st cell value is => "+data[3][1]);

	}

}
