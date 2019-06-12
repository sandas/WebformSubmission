package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerchwellContactForm {

	public static void main(String[] args) {
		contactformsubmit();
	}

	private static void contactformsubmit() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		try {
			//go to perchwell site
			driver.get("https://www.perchwell.com/professionals");
			//Click on get in touch
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();

			//enter email in text field
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sanjittest@gmail.com");
			//enter city in text field
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("New York");
			//click on contact me
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();
			//close the browser after test is complete
			driver.close();
			System.out.println("Form submitted succesfully");
		}
		//record any error occurred during process
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}




}