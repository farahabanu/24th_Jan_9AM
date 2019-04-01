package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_InputData 
{
  @Test(dataProvider = "dp")
  public void user_data(String uid,String mobile)
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"user1","9030248855"},
      new Object[] {"user2","9030848855"},
      new Object[] {"user3","9030648855"},
      new Object[] {"user4","9030448855"},
    };
  }
  
  
  
}
