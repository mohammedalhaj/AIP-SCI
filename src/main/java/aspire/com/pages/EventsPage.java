package aspire.com.pages;

import java.util.List;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;

import aspire.com.steps.Selectors;

/**
 * Page object defining the home page
 */
public class EventsPage extends GenericPage {
	public EventsPage(WebDriverProvider driverProvider) {
		super(driverProvider);

		// TODO Auto-generated constructor stub
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

}
