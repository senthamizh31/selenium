package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearch {
	
	static WebElement element = null;
	
	
	public static WebElement text_search(WebDriver driver) {	
		element = driver.findElement(By.xpath("//input[@name='q']"));
		return element;	
	}
	
	public static WebElement search_button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		return element;
		
	}

}
