package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Set is unorder collection of objects. Which
		 * don't allow duplicates in it..
		 */
		 
		Set<String> set=new HashSet<String>();
		set.add("IDE");
		set.add("APPIUM");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("APPIUM");
		
		
		//Get size of set
		int count=set.size();
		System.out.println("Size of set is => "+count);
		
		//Remove object from set
		set.remove("RC");
		
		//Verify object contains at set interface
		boolean flag=set.contains("WD");
		System.out.println("object available status is => "+flag);
		
		//Get Next iterator of Set
		String itr_next=set.iterator().next();
		System.out.println("First iterator value is => "+itr_next);
		
		
		//Apply foreach loop to print all objects
		for (String Eachset : set) 
		{
			System.out.println("=>"+Eachset);
		}
		
		
		//Us while loop to print all objects
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String record=itr.next();
			System.out.println("* "+record);
		}
		
		
		 
	}

}
