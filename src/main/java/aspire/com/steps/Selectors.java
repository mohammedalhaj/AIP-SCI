package aspire.com.steps;

import static org.openqa.selenium.By.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import jo.aspire.automation.logger.EnvirommentManager;

public class Selectors {

	WebDriverWait wait;
	private static final int CONST_WAIT_UPPER_VALUE = 60;
	private static final int CONST_WAIT_LOWER_VALUE = 30;


	

	public static String getProperty(String element) {
		return EnvirommentManager.getInstance().getProperty(element);
	}

	public static By getElement(String element) {
		return cssSelector(getProperty(element));
	}

}
