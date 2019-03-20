package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * List:--> list store objects in order. Which
		 * 			allow duplicates to store.
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("IDE");
		list.add("APPIUM");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("APPIUM");
		
		
		//Get size of count
		int count=list.size();
		System.out.println("list of objects are "+count);
		
		
		//get any single object from collection of object using index number
		String toolname=list.get(3);
		System.out.println("toolname is => "+toolname);
		
		
		
		//Apply foreach to iterate List next values
		for (String eachtool : list) 
		{
			System.out.println("=> "+eachtool);
		}
		
		
		
		
		
	}

}
