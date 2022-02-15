package sdet.assignment.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Assignment_4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Assignment1.Browser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Validating the assertion
		
		Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed());
		
	}

}
