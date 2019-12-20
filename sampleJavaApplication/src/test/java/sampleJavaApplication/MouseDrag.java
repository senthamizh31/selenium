package sampleJavaApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrag {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\senthamizh\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		Actions s = new Actions(driver);
		
		s.clickAndHold(driver.findElement(By.xpath("/html[1]/body[1]/div[1]"))).moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]"))).release().build().perform();
		//WebElement From = driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		//WebElement To = driver.findElement(By.xpath("/html[1]/body[1]/div[2]"));
		
		
		//s.dragAndDrop(From, To).build().perform();
		
	}

}
