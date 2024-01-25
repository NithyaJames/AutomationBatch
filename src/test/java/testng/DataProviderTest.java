package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "data-provider")
  public void f(int n, int s) {
	  System.out.println(n+s);
  }
  //(dataProvider ="data-provider",dataProviderClass = Grouping.class )

  @DataProvider(name="data-provider")
  public Object[][] dp() {
    	return new Object[][] {{2, 3 }, {5, 7}};
  }
  
}

