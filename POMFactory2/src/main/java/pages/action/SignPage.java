package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pages.locators.SignPageLocators;

public class SignPage extends Page {

	public SignPageLocators signPage;

	public SignPage() {
		this.signPage = new SignPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signPage);

	}

}
