package sdet.assignment.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment_8 {
	
	public WebDriver driver;

	@BeforeClass
	public void LaunchBrw() {
		driver = Assignment1.Browser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority = 0)
	public void Login() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
	}

	@Test(priority = 1)
	public void TestMethodTitleAdmin() {
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page Admin is " + title);
	}

	@Test(priority = 2)
	public void TestMethodTitlePIM() {
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page  PIM is  " + title);
	}

	@Test(priority = 3)
	public void TestMethodTitleLeave() {
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page Leave  is " + title);
	}

	@Test(priority = 4)
	public void TestMethodTitleDashboard() {
		driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page DB  is " + title);
	}

	@Test(priority = 5)
	public void TestMethodTitleDirectory() {
		driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page Directory is " + title);
	}

	@Test(priority = 6)
	public void TestMethodTitleMaintanence() {
		driver.findElement(By.xpath("//b[contains(text(),'Maintenance')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page Maintenance is " + title);
	}

	
}