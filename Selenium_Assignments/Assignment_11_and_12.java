package sdet.assignment.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(sdet.assignment.selenium.ListenersImplementation.class)
public class Assignment_11_and_12 {
	
	public static WebDriver driver;

	@BeforeClass
	public void LaunchBrw() {
		driver = Assignment1.Browser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
		@Test
		public void TestListener2() throws IOException {
				
			String text = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
			System.out.println("The text is"+""+" "+text);
			Assert.assertEquals(text, "Dashboard");
			
		}
		
		@Test(retryAnalyzer = RetrySetup.class)
		public void TestListener() throws IOException {
			
			String text = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
			
			System.out.println("The text is"+""+" "+text);
			Assert.assertEquals(text, "test");
			
		}

	}