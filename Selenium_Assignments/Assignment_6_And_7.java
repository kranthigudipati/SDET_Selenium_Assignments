package sdet.assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_6_And_7 {
	
	public WebDriver driver;
	@BeforeSuite
	
	public void OpenBrowser() {
		
		driver = Assignment1.Browser("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
	
	
	@Test(priority=1)
	
	public void OpenURL() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
	}


}
