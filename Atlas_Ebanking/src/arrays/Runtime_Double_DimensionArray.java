package arrays;

public class Runtime_Double_DimensionArray 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Runtime-double-dimension-Array:-->
		 * 		All events in runtime array allocated dynamically
		 * 		in index order.
		 */
		
		
		String userdata[][]=
				{ 
						{"9030248855","Airtel"},
						{"9030848855","Tata Docomo"},
						{"9441213490","BSNL"}, 
				};
		
		
		System.out.println("Array length is => "+userdata.length);
		
		System.out.println(userdata[1][0]);    //OP-9030248855
		
		
		
		//Store diff data into array
		Object loginid[][]=
			{
				{"Arjun",100},
				{"sundar",101},
				{"Rajesh",102},
			};
		
		
		System.out.println(loginid[1][1]);  //OP-101
		

	}

}
