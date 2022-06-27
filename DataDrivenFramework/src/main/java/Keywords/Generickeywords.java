package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generickeywords {
	public WebDriver driver;
	
	
	public void openBrowser(String browser) {
		if(browser.equals("Chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			ops.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);
			

		}else if(browser.equals("Mozilla")) {
			FirefoxOptions option = new FirefoxOptions();
			FirefoxProfile pro = new FirefoxProfile();
			pro.setPreference("dom.notifications.enabled", false);
			option.setProfile(pro);
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}else if(browser.equals("Edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--disable-notifications");
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
	}
	public void navigate(String url) {
		System.out.println("Navigation url"+ url);
		driver.get(url);
		
	}
	public void click(String locator) {
		driver.findElement(By.id(locator)).click();
		
	}
	public void type(String locator, String data) {
		driver.findElement(By.id(locator)).sendKeys(data);
		
	}
	public void select(String locator,String data) {
		
	}
	public void getText(String locator) {
		
	}
	

}
