package collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args) 
	{
		
		 Set<String> set=new HashSet<String>();
		 set.add("ide");
		 set.add("rc");
		 set.add("wd");
		 set.add("ide");
		 set.add("grid");
		 set.add("agile");
		 set.add("wd");
		 
		 
		 //Get size of Set Interface
		 int length=set.size();
		 System.out.println("Set Interface size is  --> "+length);
		 
		 //Remove object from set
		 set.remove("agile");
		 
		 //Verify object contains
		 boolean flag=set.contains("agile");
		 System.out.println("Tool Available status --> "+flag);
		 
		 //Read Next object in set
		 String itr=set.iterator().next();
		 System.out.println("Next Object in Set --> "+itr);
		 
		
		 
		 //Apply foreach loop
		for (String Eachtool : set) 
		{
			System.out.println("=> "+Eachtool);
		}
		
		
		
		 
		 
	}

}
