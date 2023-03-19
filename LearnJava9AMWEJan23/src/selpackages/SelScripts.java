package selpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {
	
	WebDriver driver;
	public static void main(String[] args) {
		SelScripts ss = new SelScripts();
		ss.launchBrowser("firefox");
		ss.basicfunctions();
	}
	
	public void basicfunctions() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		//to fetch the current url
		
	 String url=  driver.getCurrentUrl();	
	 System.out.println(url);
	 
	 //to fetch the title of the page
	 
	 String title= driver.getTitle();
	 System.out.println(title);
	 
	 //returns  current tab id
	 String tabid= driver.getWindowHandle();
	 System.out.println(tabid);
	 
	 //return html pagesource
	 String pagesource= driver.getPageSource();
	 System.out.println(pagesource);

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
