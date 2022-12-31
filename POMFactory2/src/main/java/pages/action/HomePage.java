package pages.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pages.locators.HomePageLocators;

public class HomePage extends Page {

	public HomePageLocators home;
	// WebDriver driver;

	public HomePage() {
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}

	public HomePage goToFlights() {
		// driver.findElement(By.xpath("")).click();
		home.flight_tab.click();

		return this;

	}

	public void searchFlight() throws InterruptedException {
		home.leavingFrom.click();
		home.leg1_origin.sendKeys("Delhi");

		List<WebElement> froms = driver.findElements(By.cssSelector("ul.no-bullet>li"));

		Thread.sleep(1500);
		for (WebElement from : froms) {

			if (from.getText().equalsIgnoreCase("Delhi (DEL - Indira Gandhi Intl.)")) {
				from.click();
			}
		}

		Thread.sleep(1500);
		home.going_to.click();
		home.destination.sendKeys("Mumbai", Keys.ENTER);
		home.searchBtn.click();

	}

	public void goToCar() {

		home.car.click();

	}

	public void bookPackage() {
		home.packages.click();

	}
}
