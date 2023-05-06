package testNgpackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterTestNg {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println(browser + " Borwser is not supported");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@Test(enabled = false)	
	public void handlingcalender() {
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String caltitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(caltitle);

		String month = caltitle.split(" ")[0].trim();
		String year = caltitle.split(" ")[1].trim();
		System.out.println(month + "\n" + year); 

		String nyear = String.valueOf(Integer.parseInt(year) + 1);

		while (!(month.equals("April") && (year.equals(nyear)))) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			caltitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			month = caltitle.split(" ")[0].trim();
			year = caltitle.split(" ")[1].trim();
		}

		driver.findElement(By.xpath("//a[normalize-space()='15']")).click();

	}
	
	@Test (dataProvider ="data")
	public void loginTest(String username, String password) {
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("send2")).click();
	}
	
	@DataProvider(name="data")
	public Object[][] getLogindata() {
		
		Object[][] data = new Object[1][2];
		data[0][0]="cbatest7@gmail.com";
		data[0][1]="cba@test";
		
		return data;
		
	}
}
