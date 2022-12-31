package rough;

import base.Page;
import pages.action.HomePage;

public class FlightSearchTest extends Page{

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.expedia.co.in/");
		setUp();
		HomePage home = new HomePage();
		//HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.goToFlights();
		System.out.println(driver.getTitle());
		home.searchFlight();
		System.out.println("I am the Top expert on the Planet..Thanks God!!");
		//driver.close();
		
		
		
	}

}
