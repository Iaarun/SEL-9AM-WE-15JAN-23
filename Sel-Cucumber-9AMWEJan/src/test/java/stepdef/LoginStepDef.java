package stepdef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	
	@When("user provide username and password")
	public void userSendUserNameAndPassword() {
	   driver.findElement(By.id("email")).sendKeys("cbatest7@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("cba@test");
	}

	@And("click on login button")
	public void clickOnLoginButton() {
		 driver.findElement(By.id("send2")).click();
	    
	}

	@Then("user should be able to login")
	public void usershouldBelogin() {
	 String username=  driver.findElement(By.xpath("//p[@class='hello']/strong")).getText();
	 Assert.assertTrue(username.contains("selenium user"));
	}
	

	
	@When("user provide username and incorrect password")
	public void user_provide_username_and_incorrect_password() {
		 driver.findElement(By.id("email")).sendKeys("cbatest7@gmail.com");
		   driver.findElement(By.id("pass")).sendKeys("cba@test1");
	}

	@Then("error should be displayed")
	public void error_should_be_displayed() {
	  String error=  driver.findElement(By.xpath("//li[@class='error-msg']/ul/li/span")).getText();
	  Assert.assertEquals("Invalid login or password.", error);
	  }

	@Given("user is at the login page")
	public void userisAtLoginPage() {
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
	}

	
	@When("user provide incorrect {string} and {string}")
    public void user_provide_incorrect_and(String username, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		   driver.findElement(By.id("pass")).sendKeys(password);
    }
	
	@Then("{string} should be displayed")
    public void should_be_displayed(String error)  {
		String actualerror=  driver.findElement(By.xpath("//li[@class='error-msg']/ul/li/span")).getText();
		  Assert.assertEquals(error, actualerror);
    }


}
