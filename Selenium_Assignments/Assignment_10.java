package sdet.assignment.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assignment_10 {


    @Test
	public static void GetText() {
		// TODO Auto-generated method stub

		WebDriver driver = Assignment1.Browser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Validating the assertion
		
		String text = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
		
		System.out.println("The text is"+""+" "+text);
		
	}

}
