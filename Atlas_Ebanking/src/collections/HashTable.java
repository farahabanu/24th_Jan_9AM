package collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value, Hashset
		 *  allow pair values to store.
		 */
		
		
		Hashtable<Integer, String> hash = new Hashtable<Integer,String>();
		hash.put(1,"IDE"); 
		hash.put(2,"RC");
		hash.put(3,"WD");
		hash.put(4,"GRID");
		
		
		//using keyname get keyvalue
		String val=hash.get(1);
		System.out.println("Value is => "+val);
		
		
		//Get All keys
		Set<Integer> set=hash.keySet();
		//Foreach each to iterate unorder collection of objects
		for (Integer eachkey : set) 
		{
			System.out.println("=>"+hash.get(eachkey));
		}
		
		
		
		
		
		
        
        
        
		

	}

}
