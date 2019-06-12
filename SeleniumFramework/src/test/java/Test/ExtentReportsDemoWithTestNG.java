package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {

	WebDriver driver = null;

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void setup() {

		//start extent reports
		htmlReporter = new ExtentHtmlReporter("extent.html");

		//create extent reports and attach report

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);


	}

	@BeforeTest
	public void setUpTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void test1() throws Exception {


		//creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("Google Search Test One","this is a test to validate google search functionality");

		driver.get("https://google.com");
		test.pass("Navigated to google.com");

		//log(status,details)
		test.log(Status.INFO, "Starting test case");

		//log info
		test.info("Test Completed");

		//log with snapshot
		test.fail("details");

		//test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");


	}

	@Test
	public void test2() throws Exception {

		//creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("Google Search Test One","this is a test to validate google search functionality");

		//log(status,details)
		test.log(Status.INFO, "Starting test case");

		//log info
		test.info("Test Completed");

		//log with snapshot
		test.pass("details");

		//test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");


	}

	@AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
		System.out.println("Test Completed Succesfully");
	}

	@AfterSuite
	public void teardown() {

		extent.flush();



	}
}
