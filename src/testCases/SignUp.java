package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp {
	WebDriver driver;
	
	@BeforeTest
	public void beforeExecution() {
		String path =  System.getProperty("user.dir");
		//String locat = path+"/browserfile/chromedriver";
		
		System.setProperty("webdriver.chrome.driver", path+"/browserfile/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://netowsolutions.com/swadel/");
		
		driver.findElement(By.className("fa czico-100-user-1")).click();
	}
	
	@Test
	public void emptyEmail() {
		driver.findElement(By.name("register")).click();
		
	}
	
	@Test
	public void invalidEmail() {
		driver.findElement(By.id("reg_email")).sendKeys("muba@yop");
		driver.findElement(By.name("register")).click();
	}
	
	@Test
	public void validEmail() {
		driver.findElement(By.id("reg_email")).clear();
		driver.findElement(By.id("reg_email")).sendKeys("muba@yop");
		driver.findElement(By.name("register")).click();
	}
	
	@AfterTest
	public void afterExecution() {
		
	}
	

}
