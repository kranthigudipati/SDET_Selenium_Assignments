package sdet.assignment.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment_1 {

	public static WebDriver Browser(String Browser) {
		WebDriver driver = null;
		switch (Browser) {
		case ("chrome"):
			System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");

			ChromeOptions opt = new ChromeOptions();

			opt.addArguments("start-maximized");

			opt.addArguments("incognito");

			opt.addArguments("--disable-notifications");

			driver = new ChromeDriver(opt);

			break;

		case ("firefox"):
			System.setProperty("webdriver.gecko.driver", "C:\\soft\\geckodriver.exe");

			FirefoxOptions fpt = new FirefoxOptions();

			fpt.addArguments("start-maximized");

			fpt.addArguments("incognito");

			fpt.addArguments("--disable-notifications");

			driver = new FirefoxDriver(fpt);

			break;
			
		case ("edge"):
			
			System.setProperty("webdriver.edge.driver", "C:\\soft\\msedgedriver.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		return driver;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Assignment_1.Browser("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
