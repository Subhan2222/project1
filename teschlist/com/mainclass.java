package teschlist.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.mustache.Value;

public class mainclass extends setup{

	@Test
	void signup_page(){
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("kakarla");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Subhan");
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
		gender.click();
		System.out.println("selected option = "+gender.isSelected());
		
		WebElement experiance = driver.findElement(By.xpath("//input[@id='exp-3']"));
		experiance.click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("14-05-1994");
		
		WebElement profession = driver.findElement(By.xpath("//input[@id='profession-0']"));
		profession.click();
		WebElement profession1 = driver.findElement(By.xpath("//input[@id='profession-1']"));
		profession1.click();
		
		List<WebElement> tools = driver.findElements(By.xpath("//input[starts-with(@id,'tool')]"));
		int size = tools.size();
		WebElement q;
		for(int i=0; i<size; i++ ) {
			q=tools.get(i);
			q.click();
		}
		
		WebElement continent = driver.findElement(By.xpath("//select[@id='continents']"));
		Select select = new Select(continent);
		select.selectByVisibleText("Asia");
		System.out.println("Selected option is = "+continent.getText());
		
		WebElement seleniumcommands = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select select1 = new Select(seleniumcommands);
		select1.selectByVisibleText("Browser Commands");
		select1.selectByVisibleText("Navigation Commands");
		select1.selectByVisibleText("Wait Commands");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
		button.click();
		
		WebElement uplaod = driver.findElement(By.xpath("//input[@class='input-file']"));
		uplaod.sendKeys("C:\\Users\\kakarla subhan\\Desktop\\10704383.jpg.jpeg");
		
		
		
		
		
		
		
	}
}
