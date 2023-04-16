package testNgpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNg {
	WebDriver driver;
	
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

}
