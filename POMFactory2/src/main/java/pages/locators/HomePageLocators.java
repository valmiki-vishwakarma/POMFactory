package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(css = "a[href*='flight']")
	public WebElement flight_tab;

	@FindBy(css = "a[href*='car']")
	public WebElement car;

	@FindBy(css = "a[href*='package']")
	public WebElement packages;

	// Flight search

	@FindBy(xpath = "//button[@aria-label='Leaving from']")
	public WebElement leavingFrom;

	@FindBy(css = "input#location-field-leg1-origin")
	public WebElement leg1_origin;

	@FindBy(xpath = "//button[@aria-label='Going to']")
	public WebElement going_to;

	@FindBy(css = "input#location-field-leg1-destination")
	public WebElement destination;
	

	@FindBy(css = "button[data-testid='submit-button']")
	public WebElement searchBtn;

}
