package loops;

public class For_loop {

	public static void main(String[] args)
	{
		
		/*
		 * Forloop:-->
		 * Example:-->
		 * 		Print number from 1 to 20
		 */
		 for (int i = 1; i <= 20; i++)
		 {
			 System.out.println(i);
		 }
		
		
		
		/*
		 * Exmaple:--> 
		 * 		Conduct sub between 1 to 100
		 */
		
		int sum=0;
		for (int i = 1; i <=100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("Total value is => "+sum);
		
		
		
		
		//Runtime Array
		String browser[]={"firefox","chrome","ie","safari","opera"};
		/*
		 * Example:--> Print all browser names using for loop
		 */
		for (int i = 0; i < browser.length; i++) 
		{
			System.out.println("=> "+browser[i]);
		}
		
		
		
		
		

	}

}
