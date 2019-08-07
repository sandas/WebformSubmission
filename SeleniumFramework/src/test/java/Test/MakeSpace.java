package Test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Calendar;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeSpace {

	public static void main(String[] args) throws InterruptedException {
		navigationMenu();getaQuote();
	}
	@Test
	private static void navigationMenu() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.mksp.co/");
		driver.findElementByXPath("//*[@id=\"homepage.click.business\"]").click();
		driver.navigate().to("https://qa.mksp.co/business");
		Assert.assertEquals(driver.getTitle(), "Never visit a storage unit again | MakeSpace");
		driver.navigate().back();
		driver.findElementByXPath("/html/body/header/div[1]/div/a[2]").click();
		driver.navigate().to("https://qa.mksp.co/features/");
		Assert.assertEquals(driver.getTitle(), "Storage Features | MakeSpace");
		driver.navigate().back();
		driver.findElementByXPath("/html/body/header/div[1]/div/a[3]").click();
		driver.navigate().to("https://qa.mksp.co/account/login/");
		Assert.assertEquals(driver.getTitle(), "MakeSpace");
		driver.navigate().back();
		driver.findElementByXPath("/html/body/header/div[1]/div/div/a/span").click();
		driver.navigate().to("https://qa.mksp.co/get-storage-quote/");
		Assert.assertEquals(driver.getTitle(), "Start Your Booking | MakeSpace");
		driver.navigate().back();


	}
	
	@Test
	private static void getaQuote() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.mksp.co/");
		
		driver.findElementByXPath("/html/body/div[1]/section[2]/form/div[3]/div[1]/input").sendKeys("Test Test");
		driver.findElementByXPath("/html/body/div[1]/section[2]/form/div[3]/div[1]/input").clear();
	
		driver.findElementByXPath("/html/body/div[1]/section[2]/form/div[3]/div[1]/input").sendKeys("Test Test");
		driver.findElementByXPath("/html/body/div[1]/section[2]/form/div[3]/div[2]/input").clear();
		driver.findElementByXPath("/html/body/div[1]/section[2]/form/div[3]/div[2]/input").sendKeys("+15022967866");
		driver.findElementByXPath("/html/body/div[1]/section[2]/form/div[3]/div[3]/input").clear();
		driver.findElementByXPath("/html/body/div[1]/section[2]/form/div[3]/div[3]/input").sendKeys("10038");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"homepage.click.lead_capture\"]").click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElementByXPath("//*[@id=\"homepage.click.lead_capture\"]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@id=\"ms-booking\"]/div/div/section/div[1]/div/article[1]/div[3]/button").click();
		driver.findElementByXPath("//*[@id=\"ms-booking\"]/div/div/section/div[1]/div/article[2]/form/div/div[1]/div/input").sendKeys("4");
		Thread.sleep(1000);
		driver.findElementByXPath("/html/body/div[3]/div/div/div/section/div[1]/div/article[2]/form/div/div[2]/button").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div[3]/div[1]/button").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div/div[1]/div[1]/div[3]/div[1]").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div/div[1]/div[2]/div[3]/div[2]").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div/div[1]/div[3]/div[3]/div[2]").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div/div[1]/div[4]/div[3]/div[2]").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div/div[1]/div[5]/div[3]/div[2]").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div/div[2]/button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"js-address\"]").sendKeys("123 William St" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElementByClassName("calendar-loading-state").findElement(By.xpath("/html/body/div[7]/table/tbody/tr[4]/td[4]/a")).click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/button").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/form/div[2]/div[1]/div[2]/div/input").sendKeys("Test Test");
		driver.findElementByXPath("/html/body/div[3]/div/div/div/form/div[2]/div[2]/div[2]/div/input").sendKeys("+15022967866");
		driver.findElementByXPath("/html/body/div[3]/div/div/div/form/div[3]/label/span[1]").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div/section[2]/button").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"js-cc-number\"]").sendKeys("4242 4242 4242 4242");
		driver.findElementByXPath("//*[@id=\"js-cc-cvc\"]").sendKeys("123");
		driver.findElementByXPath("//*[@id=\"js-cc-exp-date\"]").sendKeys("1221");
		driver.findElementByXPath("//*[@id=\"js-cc-name\"]").sendKeys("Test Test");
		driver.findElementByXPath("/html/body/div[3]/div/div/div[1]/div[2]/form/article/input").click();
		driver.findElementByXPath("//*[@id=\"js-phone\"]").sendKeys("+15022967866");
		driver.findElementByXPath("//*[@id=\"js-email\"]").sendKeys("123@test.com");
		driver.findElementByXPath("/html/body/div[3]/div/div/div[1]/div[2]/form/div/div/div[2]/div[2]/div/div/label[2]/div").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div[1]/div[2]/form/div/article/div/div/div[3]/label/div").click();
		driver.findElementByXPath("/html/body/div[3]/div/div/div[1]/div[2]/form/div/article/div/div/div[4]/input").click();
	
		
		
}
	




}
