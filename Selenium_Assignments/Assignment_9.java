package sdet.assignment.selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Assignment_9 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Assignment1.Browser("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//To Print title of the Page 
		
		Point p = new Point(0,3000);
		
		driver.manage().window().setPosition(p);
		
	   // driver.manage().window().minimize();

	}

}
