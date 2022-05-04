package flipkart;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilitties.ScreenShort;

public class loginPage extends setUp {
	
	@Test
	public void login() throws InterruptedException, IOException {
		
		//WebElement loginOption = driver.findElement(By.linkText("Login"));
		//loginOption.sendKeys("nanisubhan");
		
			
		//Thread.sleep(5000);
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		WebElement userField = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
		javascript.executeScript("arguments[0].value='12345'",userField);
		WebElement passwordFiled = driver.findElement(By.xpath("//span[text()='Enter Password']"));
		javascript.executeScript("arguments[0].value='12345'",passwordFiled);
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='_1D1L_j']/button[@type='submit']"));
		loginButton.click();
		/*WebElement userField = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
		userField.sendKeys("112345");
			
		WebElement passwordFiled = driver.findElement(By.xpath("//span[text()='Enter Password']"));
		passwordFiled.click();
		
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='_1D1L_j']/button[@type='submit']"));
		loginButton.click();*/
		Thread.sleep(5000);
	
	
		/*catch(ElementNotInteractableException ex){
		ScreenShort.screenShot(driver);
		
	}*/
	
	}

}
