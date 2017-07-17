package aspire.com.pages;

import java.util.List;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;

import aspire.com.steps.Selectors;

/**
 * Page object defining the home page
 */
public class DattoPage extends GenericPage {
	public DattoPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void enterInvalidEmail() {
		waitUntilElementVisible(Selectors.getElement("subscribeEmailTextBox"), 5);
		findElement(Selectors.getElement("subscribeEmailTextBox")).clear();
		findElement(Selectors.getElement("subscribeEmailTextBox")).sendKeys(Selectors.getProperty("invalid_email"));
		clickOnElement("subscribePopupButton");
	}

	public boolean eventFilter() {
		List<WebElement> filterOptions = findElements(Selectors.getElement("filterOptions"));
		WebElement filterByMenu = findElement(Selectors.getElement("filterByMenu"));
		WebElement filterButton = findElement(Selectors.getElement("filterButton"));

		boolean isWorkingProberly = true;
		for (int i = 0; i < filterOptions.size(); i++) {
			filterByMenu.click();
			filterOptions.get(i).click();
			filterButton.click();
			sleepTime(2000);
			filterOptions = findElements(Selectors.getElement("filterOptions"));
			filterByMenu = findElement(Selectors.getElement("filterByMenu"));
			filterButton = findElement(Selectors.getElement("filterButton"));

			if (filterOptions.get(i).getText().equals("All Events")) {
				isWorkingProberly = isWorkingProberly && (findElements(Selectors.getElement("eventCards")).size() == 4);
			} else if (filterOptions.get(i).getText().equals("Roadshow")) {
				isWorkingProberly = isWorkingProberly && (findElements(Selectors.getElement("eventCards")).size() == 2);
			} else if (filterOptions.get(i).getText().equals("Webinar")
					|| (filterOptions.get(i).getText().equals("Dattocon"))) {
				isWorkingProberly = isWorkingProberly && (findElements(Selectors.getElement("eventCards")).size() == 1);
			} else {
				isWorkingProberly = isWorkingProberly && (findElements(Selectors.getElement("eventCards")).size() == 0);
			}

			isWorkingProberly = isWorkingProberly
					&& filterOptions.get(i).getText().equals(findElement(Selectors.getElement("cardHeader")).getText());
		}
		return isWorkingProberly;
	}

	public boolean searchFunctionality() {
		waitUntilElementVisible(Selectors.getElement("searchBox"), 5);
		findElement(Selectors.getElement("searchBox")).sendKeys(Selectors.getProperty("valid_text"));
		clickOnElement("searchButton");
		waitUntilElementVisible(Selectors.getElement("results"), 5);
		boolean isFunctional = false;
		isFunctional = verifyElementDisplaysWithText("titleOfSearchResults",
				"Search results for: " + Selectors.getProperty("valid_text"))
				&& findElements(Selectors.getElement("results")).size() >= 1;
		return isFunctional;
	}
}
