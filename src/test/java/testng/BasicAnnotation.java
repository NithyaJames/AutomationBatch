package testng;

import org.testng.annotations.Test;

public class BasicAnnotation {
  @Test(groups="Run")
  public void testCase07() {
	  System.out.println("Test Case07");
  }
  @Test(priority=2)
  public void testCase02() {
	  System.out.println("Test Case02");
  }
  @Test(priority=2)
  public void testCase03() {
	  System.out.println("Test Case03");
  }
  @Test(enabled=false)
  public void testCase04() {
	  System.out.println("Test Case04");
  }
  @Test(enabled=true,groups="Run")
  public void testCase05() {
	  System.out.println("Test Case05");
  }
}
