import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTestAllinone {
  @Test(priority = 2)
  public void test_1() {
	  System.out.println("test_1");
  }
  @Test(priority = 1, alwaysRun = true)// if in the testcase fail then it not go ferther to exicution by using alwayesRun true if it fail it not Skip the tascase it runalwayes
  public void test_2() {
	  System.out.println("test_2");
  }
  @Test(priority = 0)// we also set priority to decide which tastcase run first
  public void test_3() {
	  System.out.println("test_3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method all");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method all");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class all");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after calss all");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before testa all");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test all");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println( "Before suite all");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite all");
  }

}
