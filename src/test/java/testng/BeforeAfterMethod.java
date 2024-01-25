package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
  @Test(groups="Run")
  public void testCase01() {
	  System.out.println("TestCase01");
  }
  @Test
  public void testCase02() {
	  System.out.println("TestCase02");
  }
  @Test
  public void testCase03() {
	  System.out.println("TestCase03");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

}
