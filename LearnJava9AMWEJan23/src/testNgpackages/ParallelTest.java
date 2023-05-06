package testNgpackages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ParallelTest {
 
  
  @Test 
  public void test2() {
	  System.out.println(Thread.currentThread().getId());

  } 
  @Test 
  public void test3() {
	  System.out.println(Thread.currentThread().getId());
  }
  
  @Test
  public void test4() {
	  
	  System.out.println(Thread.currentThread().getId());
  }
 
  
  
  


}
