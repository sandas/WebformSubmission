package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();
		// TODO Auto-generated method stub

	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//go to google
		driver.get("http://google.com");
		//enter text in search box
		//driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step By Step");
		//click on search
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		

		System.out.println("Test Completed Succesfully");

}}
