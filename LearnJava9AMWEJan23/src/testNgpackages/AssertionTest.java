package testNgpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionTest {
WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	} 
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void testAssert() {
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		String expectedTitle= "Customer Login";
		
		String title=driver.getTitle();
		Assert.assertEquals(title, expectedTitle);
	}

	@Test
	public void testSoftAssert() {
		
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		String expectedTitle= "Customer Login";
		
		String title=driver.getTitle();
		softassert.assertEquals(title, expectedTitle);
		
		softassert.assertAll();
	}

}
