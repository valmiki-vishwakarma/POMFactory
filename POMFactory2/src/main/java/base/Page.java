package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static WebDriver driver;

	public static void setUp() {

		if (Constants.browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (Constants.browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else
			System.err.println("Invalid browser was passed : " + Constants.browser);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Constants.testsiteurl);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.timeOut));

	}

	public static void quitBrowser() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
