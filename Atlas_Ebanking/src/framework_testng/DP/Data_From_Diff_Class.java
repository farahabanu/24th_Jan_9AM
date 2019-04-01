package framework_testng.DP;

import org.testng.annotations.Test;

public class Data_From_Diff_Class 
{
	@Test(dataProvider="dp",dataProviderClass=DP_InputData.class)
	public void User_Data(String uid,String mobile)
	{
		
	}

}
