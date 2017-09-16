package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Generic.BaseClass;

public class SeleniumClass extends BaseClass{
	
	WebDriver driver;
	WebElement element;

	protected void launchBrowser(String browserName)
	{
	System.out.println("This is crome browser");
	String currentPath= System.getProperty("user.dir");
	System.out.println(currentPath);
	currentPath= currentPath + "\\src\\test\\java\\Util\\";
	
	if(browserName.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", currentPath+"chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko,driver", currentPath+"geckodriver.exe");
		driver = new FirefoxDriver();
		
		
	}
	else if (browserName.equalsIgnoreCase("IE")) {
		
		System.setProperty("webdriver.ie.driver", currentPath+"IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	else {
		System.out.println("Incorrect browser name");
	}
	}
	
	protected void openUrl(String URL)
	{
		//System.out.println("Opening URL");
		driver.get(URL);
		
	}
	
	protected void closeBrowser()

	{
		driver.close();
		driver.quit();
	}
	
	public WebElement identifyElement(String locatorType, String locator)
	{
		if (locatorType.equalsIgnoreCase("id")) {
			element= driver.findElement(By.id(locator));
		}
		else if (locatorType.equalsIgnoreCase("name")){
			element= driver.findElement(By.name(locator));
		}
		else if (locatorType.equalsIgnoreCase("class")) {
			element= driver.findElement(By.className(locator));
		}
		else if (locatorType.equalsIgnoreCase("link text")) {
			element= driver.findElement(By.linkText(locator));
		}
		
		else if(locatorType.equalsIgnoreCase("tag name")) {
			element= driver.findElement(By.tagName(locator));
		}
		
		else if(locatorType.equalsIgnoreCase("partial link text")) {
			element= driver.findElement(By.partialLinkText(locator));
		}
		
		else if(locatorType.equalsIgnoreCase("css")) {
			element= driver.findElement(By.cssSelector(locator));
		}
		
		else if(locatorType.equalsIgnoreCase("xpath")) {
			element= driver.findElement(By.xpath(locator));
		}
		
		else {
			System.out.println("Locator type incotrect");
		}
		return element;	
				
		
	}
}
