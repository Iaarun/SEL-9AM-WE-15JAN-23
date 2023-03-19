package selpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelBasicFunctions {
	WebDriver driver;
	public static void main(String[] args) {
		SelBasicFunctions sbf = new SelBasicFunctions();
		sbf.launchBrowser("safari");
	}
	
	public void launchchrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
		 driver.close();
	}
	
	public void launchfirefox() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	}
	
	
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println(browser+ " Borwser is not supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
	}
	
	

}
