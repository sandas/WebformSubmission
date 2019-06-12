package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();
		// TODO Auto-generated method stub

	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//go to google
		driver.get("http://google.com");
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		//click on search
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		

		System.out.println("Test Completed Succesfully");

}}
