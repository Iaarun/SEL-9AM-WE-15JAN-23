package selpackages;

import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelScripts {

	WebDriver driver;

	ChromeDriver cdriver;
	FirefoxDriver fdriver;

	public static void main(String[] args) throws InterruptedException, IOException {
		SelScripts ss = new SelScripts();
		ss.launchBrowser("chrome");
		// ss.launchBrowser1("firefox");
		ss.explicitwaits();
	}
	
	
	public void explicitwaits() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
		
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@id='landscape']")));
	   WebElement done = driver.findElement(By.xpath("//p[contains(text(),'Done')]"));
		System.out.println(done.getText());
	   
	   
	}

	public void seleniumWaits() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

		WebElement done = driver.findElement(By.xpath("//p[contains(text(),'Done')]"));
		System.out.println(done.isDisplayed());
	}

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

	public void handleHtmltable() {
		driver.get(
				"https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-100-companies-list/27?classic=true&categoryId=1&exType=N");
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='indicesTable']/thead/tr/th"));
		int colNum = columns.size();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr"));
		int rownum = rows.size();

		// read first column data

		for (int i = 1; i <= rownum; i++) {
			WebElement data = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[" + i + "]/td[1]"));
			System.out.println(data.getText());
		}
		System.out.println("==========================");
		// reading row data
		for (int i = 1; i <= colNum; i++) {
			WebElement data = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[3]/td[" + i + "]"));
			System.out.print(data.getText() + " ");
		}

		System.out.println("==========================");

		// complete table data

		for (int i = 1; i <= rownum; i++) {
			for (int j = 1; j <= colNum; j++) {
				WebElement data = driver
						.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(data.getText() + " | ");
			}

			System.out.println();
		}
	}

	public void multiplewindows() throws InterruptedException {
		driver.get("https://www.naukri.com/");
		String tab1 = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//div[normalize-space()='Services']")).click();
		Set<String> alltabs = driver.getWindowHandles();

		for (String id : alltabs) {
			if (!id.equals(tab1)) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.close();
			}
		}

		driver.switchTo().window(tab1);
		System.out.println(driver.getCurrentUrl());

	}

	public void openclosenewtabs() {
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		String tab1 = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		String tab2 = driver.getWindowHandle();
		driver.get("https://jqueryui.com/tooltip/");

		driver.switchTo().window(tab1);
	}

	public void handleTooltip() {
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.id("age"));

		String tooltip = age.getAttribute("title");
		System.out.println(tooltip);
	}

	public void handleAutoSuggestion() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("user in");
		List<WebElement> alloption = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		for (WebElement x : alloption) {
			// System.out.println(x.getText());
			if (x.getText().trim().equalsIgnoreCase("user interface")) {
				x.click();
			}
		}
	}

	public void handlemodaldialog() {
		driver.get("https://www.facebook.com/");
		// driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]"));
		WebElement createbtn = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]"));
		createbtn.click();

		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Test User");
	}

	public void fileupload() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

		WebElement myfile = driver.findElement(By.name("my-file"));
		String path = System.getProperty("user.dir");
		System.out.println(path);
		myfile.sendKeys(path + "\\src\\slider.png");
		System.out.println("File upload done");
	}

	public void capturescreenshot() throws IOException {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);
		action.clickAndHold(slider).moveByOffset(500, 0).release().build().perform();

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(file, new File("./src/slider" + System.currentTimeMillis() + ".png"));
		System.out.println("Screenshot captured");

		// capture sscreenshot for specific element

		// driver.switchTo().frame(0);
		WebElement slide = driver.findElement(By.xpath("//div[@id='slider']"));

		file = slide.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./src/frames" + System.currentTimeMillis() + ".png"));
		System.out.println(" Frames Screenshot captured");

	}

	public void scroll() {
		// use javascript executor to scroll on a page
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// random scroll
		// js.executeScript("window.scrollBy(0,2000)" );

		// scroll to bring a specific element into view
		WebElement blog = driver.findElement(By.xpath("//h3[normalize-space()='From The Blog']"));
		// js.executeScript("arguments[0].scrollIntoView();", blog);

		// scroll till the page height
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void handleSlider() {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);

		action.clickAndHold(slider).moveByOffset(500, 0).release().build().perform();

	}

	public void draganddrop() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement trg = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		// action.clickAndHold(src).moveToElement(trg).release().build().perform();

		action.dragAndDrop(src, trg).perform();

	}

	public void handleFrame() {
		driver.get("https://jqueryui.com/droppable/");
		// switch to frame
		// WebElement dframe= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println(drag.isDisplayed());

		// switch to default content
		driver.switchTo().defaultContent();

		WebElement image = driver.findElement(By.xpath("//a[@href='/']"));
		System.out.println(image.isDisplayed());
	}

	public void handleKeyBoardActions() throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
		WebElement dd2 = driver.findElement(By.id("my-dropdown-2"));

		Actions action = new Actions(driver);
		/*
		 * // context click action.contextClick(dd2).perform(); // mousehover WebElement
		 * contectmenu = driver.findElement(By.id("context-menu-2"));
		 * action.moveToElement(contectmenu).sendKeys(Keys.DOWN).click().build().perform
		 * ();
		 */
		// double click
		WebElement dd3 = driver.findElement(By.id("my-dropdown-3"));
		action.doubleClick(dd3).perform();
		Thread.sleep(2000);
		WebElement contectmenu = driver.findElement(By.id("context-menu-3"));
		action.moveToElement(contectmenu).sendKeys(Keys.DOWN).click().build().perform();
	}

	public void handleAlert() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		WebElement prompt = driver.findElement(By.id("my-prompt"));
		prompt.click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.sendKeys("TestUser");
		alert.accept();
	}

	public void handlingmultiplecheckbox() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		List<WebElement> allcheckbox = driver.findElements(By.name("my-check"));

		for (WebElement a : allcheckbox) {
			if (!a.isSelected()) {
				a.click();
			}
		}
	}

	public void handlingcheckbox() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement checkbox2 = driver.findElement(By.id("my-check-2"));
		checkbox2.click();
	}

	public void clickonHyperlink() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement link = driver.findElement(By.linkText("Return to index"));
		link.click();
		driver.navigate().back();
		link = driver.findElement(By.partialLinkText("Return to"));
		link.click();
	}

	public void sendData() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement textinput = driver.findElement(By.id("my-text-id"));
		textinput.sendKeys("TestUser1");

		// check if element is displayed on the page
		WebElement disabledInput = driver.findElement(By.name("my-disabled"));

		System.out.println("Is the element displayed: " + disabledInput.isDisplayed());// true

		System.out.println("Is the element enabled: " + disabledInput.isEnabled());// false

		System.out.println("Is the element selected: " + disabledInput.isSelected());// false

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
