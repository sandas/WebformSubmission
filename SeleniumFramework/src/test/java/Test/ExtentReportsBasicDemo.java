package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//start extent reports
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		//create extent reports and attach report
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test One","this is a test to validate google search functionality");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		//log(status,details)
				test1.log(Status.INFO, "Starting test case");
		
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in search box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		
		driver.close();
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		//calling flush writes everything to the log file
		extent.flush();
		
		
		

	}

}
