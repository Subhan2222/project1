package flipkart;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class setUp {
	WebDriver driver;
	@BeforeTest
	public void browserIntilaising() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kakarla subhan\\eclipse-workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("Window Page Title= "+driver.getTitle());
		System.out.println("Window Page Url= "+driver.getCurrentUrl());
		try {
			WebElement alretWindow = driver.findElement(By.xpath("//div[@class='_3wFoIb row']"));
			System.out.println("Is Alert present: "+alretWindow.isEnabled());
			WebElement alert = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			alert.click();
		}
		catch(NoSuchElementException ex) {
			System.out.println("no Alret present");
		}
		
	}
	
	
	
	@AfterTest
	public void BrowserQuit() {
		driver.quit();
	}

}
