package aspire.com.steps;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.openqa.selenium.By;

import jo.aspire.automation.logger.EnvirommentManager;

public class Selectors {

	public static String getProperty(String element) {
		return EnvirommentManager.getInstance().getProperty(element);
	}

	public static By getElement(String element) {
		return cssSelector(getProperty(element));
	}

}
