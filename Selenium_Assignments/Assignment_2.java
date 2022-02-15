package sdet.assignment.selenium;

import org.openqa.selenium.WebDriver;

public class Assignment_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Assignment1.Browser("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//To Print title of the Page 
		
		System.out.println("The title of the page is "+""+" "+" "+driver.getTitle());

	}

}
