package com.step_Defination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_Defination {
	
	public WebDriver driver;
	
	
	@Given("^When I am in OrangeHRP Application$")
	public void when_I_am_in_OrangeHRP_Application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@Then("^Login to Application$")
	public void login_to_Application() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	    
	}

	@When("^Dashboard page is available$")
	public void dashboard_page_is_available() throws Throwable {
	    
		Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed());
	    
	}

	@And("^click on Admin menu$")
	public void click_on_Admin_menu() throws Throwable {
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page Admin is " + title);
	    
	}
	
	@Given("^When I click on Admin Link$")
	public void when_I_Click_On_Admin_Link() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	   	
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of page Admin is " + title);
	   
	}
	
	
	@Then("^Click on Job$")
	public void Click_On_Job() throws Throwable {
		
		driver.findElement(By.xpath("//a[text()='Job']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
	   
	}
	
	@And("^validate text – Job Title$")
	public void Validate_Text() throws Throwable {
		
		String text = driver.findElement(By.xpath("//div[@class='head']/h1")).getText().trim();
		Thread.sleep(2000);
		Assert.assertEquals(text, "Job Titles");
	   
	}



	
}
