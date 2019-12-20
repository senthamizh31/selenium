package sampleJavaApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.googlesearch;

public class firstTest {
	
	
	@Test
	public void test() throws Exception {
		FileInputStream file = new FileInputStream(new File("C:\\Users\\DOTNET\\git\\selenium\\sampleJavaApplication\\src\\test\\java\\sampleJavaApplication\\config.properties"));
		Properties prop = new Properties();
		prop.load(file);
		
		
		
		String browser = prop.getProperty("browser");
		
		
		System.out.println(browser);
		if (browser == "firefox") {
			System.setProperty("webdriver.gecko.driver", "");
			
			
		}else if (browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "");
		}
				
		
	}
	
	
	


}
