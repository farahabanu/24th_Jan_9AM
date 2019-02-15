package corejava.Variables;

public class String_Comparision_commands 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 		=> String is a non primitive datatype.
		 * 		=> String accept set of characters to store
		 *      => String Also called as class, because string
		 *      	contains set of events to valid behaviour
		 *      	of stored characters.
		 */
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false
		 */
		
		String act_result="Account Created";
		String exp_result="account created";
		
		boolean flag=act_result.equals(exp_result);
		System.out.println("Equal comparision is => "+flag);
		
		/*
		 * EqualIngorecase:-->
		 * 		Method verify equalignorecase and retur boolean value
		 * 		true/false
		 */
		boolean flag1=act_result.equalsIgnoreCase(exp_result);
		System.out.println("EqualIgnorecase comparision is => "+flag1);
		
		/*
		 * contains:-->
		 * 	 Method verify subString availabe at mainString
		 */
		String product="Iphone[64GB-Black]";
		boolean flag2=product.contains("Iphone");
		boolean flag3=product.contains("Black");
		boolean flag4=product.contains("32GB");
		System.out.println(flag2+"  "+flag3+"  "+flag4);
		
		
		/*
		 * length:-->
		 * 		Method return characters length at string
		 */
		String mobile="9030248855";
		int len=mobile.length();
		System.out.println("Mobile number length is => "+len);
		
		
		/*
		 * trim:--> 
		 * 		Method trim extra spaces at string
		 */
		String pincode="   5100065   ";
		System.out.println("Before trim length of pincode is => "+pincode.length());
		//trim extra spaces
		String new_pincode=pincode.trim();
		System.out.println("After trim length of pincode is => "+new_pincode.length());
		
		
		/*
		 * subString:-->
		 * 		method get subString from main Stirng
		 */
		 String AccountNum="1234587451245785";
		//Get last 6 digit characters at account number
		 String Last_digits=AccountNum.substring(10);
		 System.out.println("Last 6 digit code is => "+Last_digits);
		//get Middle characters from account number
		 String Middle_num=AccountNum.substring(5, 8);
		 System.out.println("Middle number at accoutn is => "+Middle_num);
		 
		 
		 /*
		  * isempty:-->
		  * 		Method verify string emtpy status and 
		  * 		return true/false;
		  */
		 String var1="";
		 String var2="MQ";
		 System.out.println("var1 empty status is => "+var1.isEmpty());
		 System.out.println("var2 empty status is => "+var2.isEmpty());
		 
		 
		 /*
		  * Startswith:-->
		  * 		Method verify string started with expected charactes
		  * 		and return true/false
		  */
		 String IFSC_Code="HDFC000111";
		 boolean flag5=IFSC_Code.startsWith("HDFC");
		 System.out.println("Starswith status is => "+flag5);
	}

}
