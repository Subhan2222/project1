package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fashion extends setUp {

	@Test
	public void mensFashion() throws InterruptedException {
		
		Actions action =  new Actions(driver);
		WebElement fashionButton = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		action.moveToElement(fashionButton).perform();
		Thread.sleep(5000);
		WebElement mensFootWear = driver.findElement(By.xpath("//a[contains(text(),'Men Footwear')]"));
		action.moveToElement(mensFootWear).build().perform();
		Thread.sleep(5000);
		WebElement mensFootWearALL = driver.findElement(By.xpath("//a[text()='ALL']"));
		action.moveToElement(mensFootWearALL).click().build().perform();
		Thread.sleep(5000);
		System.out.println("page Title= "+mensFootWearALL.getText());
		Thread.sleep(5000);
		
	}

}
