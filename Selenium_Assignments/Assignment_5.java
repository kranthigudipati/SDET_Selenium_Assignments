package sdet.assignment.selenium;

import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;

public class Assignment_5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Assignment1.Browser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("User Management");
		
		ar.add("Organization");
		
		ar.add("Job");
		
		ar.add("Qualifications");
		
		
		
		List<WebElement> el = driver.findElements(By.xpath("//li[@class='current main-menu-first-level-list-item']/ul/li/a"));
		
		
		for (int i=0;i<el.size()-2;i++) {
			
		
			org.testng.Assert.assertTrue(ar.contains(el.get(i).getText().trim()));
			
		}
			
		
	}

}
