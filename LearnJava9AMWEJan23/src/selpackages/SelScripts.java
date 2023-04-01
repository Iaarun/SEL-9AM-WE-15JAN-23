package selpackages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {

	WebDriver driver;

	ChromeDriver cdriver;
	FirefoxDriver fdriver;

	public static void main(String[] args) {
		SelScripts ss = new SelScripts();
		ss.launchBrowser("firefox");
		// ss.launchBrowser1("firefox");
		ss.sendData();
	}

	public void sendData() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement textinput = driver.findElement(By.id("my-text-id"));
		textinput.sendKeys("TestUser1");

		// check if element is displayed on the page
		WebElement disabledInput = driver.findElement(By.name("my-disabled"));
		
		 System.out.println("Is the element displayed: "+disabledInput.isDisplayed());//true
		 
		 System.out.println("Is the element enabled: "+disabledInput.isEnabled());//false
		 
		 System.out.println("Is the element selected: "+disabledInput.isSelected());//false
		 

	}

	public void navigationcommands() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.google.com/?gws_rd=ssl");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.switchTo().newWindow(WindowType.TAB);
		// closes tha tab
		// driver.close();

		// kill the browser instance
		driver.quit();
	}

	public void basicfunctions() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		// to fetch the current url

		String url = driver.getCurrentUrl();
		System.out.println(url);

		// to fetch the title of the page

		String title = driver.getTitle();
		System.out.println(title);

		// returns current tab id
		String tabid = driver.getWindowHandle();
		System.out.println(tabid);

		Set<String> allid = driver.getWindowHandles();

		allid.forEach(x -> {
			System.out.println(x);
		});
		// return html pagesource
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

	}

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
//		driver.manage().window().minimize();

	}

	// valid for selenium version prior to 4.6.0
	public void launchBrowser1(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Automationtools\\seljars\\cd111\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Automationtools\\seljars\\ff31\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println(browser + " Borwser is not supported");
		}

		driver.manage().window().maximize();
		// driver.manage().window().minimize();

	}

}
