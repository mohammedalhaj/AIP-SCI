package aspire.com.pages;

import java.util.List;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;

import aspire.com.steps.Selectors;

/**
 * Page object defining the home page
 */
public class BlogPage extends GenericPage {
	public BlogPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void enterInvalidEmail() {
		waitUntilElementVisible(Selectors.getElement("subscribeEmailTextBox"), 5);
		findElement(Selectors.getElement("subscribeEmailTextBox")).clear();
		findElement(Selectors.getElement("subscribeEmailTextBox")).sendKeys(Selectors.getProperty("invalid_email"));
		clickOnElement("subscribePopupButton");
	}



}
