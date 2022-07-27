package teschlist.com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import junit.framework.Assert;

public class setup {
	WebDriver driver;
	@BeforeMethod
	void base() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kakarla subhan\\eclipse-workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println("current URL= "+url);
		Assert.assertEquals(url, "https://www.techlistic.com/p/selenium-practice-form.html");
		
	}
	
	@AfterMethod
	void teardown() {
		//driver.quit();
		
	}

}
