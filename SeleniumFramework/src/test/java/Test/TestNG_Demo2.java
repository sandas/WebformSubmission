package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo2 {

	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	public static void googleSearch2() {
		//go to google
		driver.get("http://google.com");
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		//click on search
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		}
		
	@Test
	public static void googleSearch3() {
		//go to google
		driver.get("http://google.com");
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		//click on search
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		}
		
	@AfterTest
		public void tearDownTest() {
			//close browser
			driver.close();
			System.out.println("Test Completed Succesfully");

}}
