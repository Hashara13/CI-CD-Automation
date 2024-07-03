package demo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class launchWindow {
	WebDriver driver;
	@Test
	public void testWindow() {
		driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 String Title=driver.getTitle();
		 AssertJUnit.assertTrue(Title.equals("Google"));
	}
	@BeforeTest
	public void open() {
		 driver = new FirefoxDriver();

	}
	@AfterTest
	public void close() {
		driver.close();

	}
	
	
}
