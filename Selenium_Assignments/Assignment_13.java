package sdet.assignment.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Assignment_13 {
	
	public static WebDriver driver;

	@BeforeClass
	public void LaunchBrw() {
		driver = Assignment1.Browser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority = 0)
	public void LoginPIM() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Linda Anderson");
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		String txt =driver.findElement(By.xpath("//a[contains(text(),'Anderson')]")).getText();
		
        Assert.assertEquals(txt, "Anderson");
		
		Shutterbug.shootPage(driver).withName("AndersonPage").save();
	}

}
