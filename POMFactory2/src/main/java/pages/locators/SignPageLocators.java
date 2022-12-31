package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Page;

public class SignPageLocators extends Page {

	@FindBy(xpath = "//div[contains(text(),'Sign in')]")
	public WebElement signBtn;

	@FindBy(xpath = "//a[text()='Sign in']")
	public WebElement signIn;

	@FindBy(css = "input#loginFormEmailInput")
	public WebElement emailAddress_textBox;

	@FindBy(css = "input#loginFormPasswordInput")
	public WebElement passwordxtbox;

	@FindBy(css = "button#loginFormSubmitButton")
	public WebElement loginBtn;
	

}
