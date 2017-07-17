package aspire.com.pages;

import static org.openqa.selenium.By.cssSelector;

import java.util.List;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aspire.com.steps.Selectors;
import jo.aspire.automation.logger.EnvirommentManager;
import jo.aspire.generic.OSValidator;

/**
 * Page object defining the home page
 */
public class GenericPage extends FluentWebDriverPage {
	public GenericPage(WebDriverProvider driverProvider) {
		super(driverProvider);

		// TODO Auto-generated constructor stub
	}

	public static String sharedString;
	WebDriverWait wait;

	/**
	 * Default Selector within the class
	 */
	private final int CONST_WAIT_LOWER_VALUE = 10;

	public Boolean waitElementToBeVisible(String cssSelector, int time) {
		final By locator = Selectors.getElement(cssSelector);
		try {
			wait = new WebDriverWait(getDriverProvider().get(), time);
			wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver webDriver) {
					System.out.println("waiting...");
					sleepTime(1000);
					return webDriver.findElement(locator) != null;
				}
			});

			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public WebElement getElementByCssSelector(String cssSelector) {
		Assert.assertTrue(waitElementToBeVisible(cssSelector, CONST_WAIT_LOWER_VALUE));
		return getDriverProvider().get().findElement(Selectors.getElement(cssSelector));
	}

	public List<WebElement> getElementsByCssSelector(String cssSelector) {
		Assert.assertTrue(waitElementToBeVisible(cssSelector, CONST_WAIT_LOWER_VALUE));
		return getDriverProvider().get().findElements(cssSelector(cssSelector));
	}

	public void logUserOut() {
		getDriverProvider().get().manage().deleteAllCookies();
		navigate().refresh();

	}

	public void go(String URL) {
		if (OSValidator.isMac()) {
			getDriverProvider().get().manage().window().setSize(new Dimension(1420, 1080));
		} else {
			getDriverProvider().get().manage().window().maximize();
		}

		get(URL);

	}

	public void waitUntilElementInvisible(By locator, long timeOutInSeconds) {
		try {
			wait = new WebDriverWait(getDriverProvider().get(), timeOutInSeconds);

			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		} catch (TimeoutException e) {

		}
	}

	// uses JS to click on WebElement work around IE clicking bug
	public void jsClick(By locator) {
		waitUntilElementVisible(locator, 10);
		WebElement element = findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor) getDriverProvider().get();
		executor.executeScript("arguments[0].click();", element);
	}

	public void jsClick(WebElement elem) {

		JavascriptExecutor executor = (JavascriptExecutor) getDriverProvider().get();
		executor.executeScript("arguments[0].click();", elem);
	}

	// makes List of Elements By locator and returns one of them
	public WebElement getElementFromCollectionOf(By locator, int elementIndex) {
		WebElement elem = findElements(locator).get(elementIndex);
		return elem;
	}

	// move mouse to location (hover) js workaround for safari
	public boolean jsHoverOver(WebElement element) {
		boolean result = false;
		try {
			String mouseOverScript = "" + "if(document.createEvent){"
					+ "var evObj = document.createEvent('MouseEvents');" + "evObj.initEvent('mouseover',true, false); "
					+ "arguments[0].dispatchEvent(evObj);" + "}" + "else if(document.createEventObject){ "
					+ "arguments[0].fireEvent('onmouseover');" + "}";
			JavascriptExecutor js = (JavascriptExecutor) getDriverProvider().get();
			js.executeScript(mouseOverScript, element);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	// checks if element is Visible
	public Boolean isElementVisible(final By locator) {
		try {
			wait = new WebDriverWait(getDriverProvider().get(), 5);
			wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver webDriver) {
					System.out.println("waiting...");
					sleepTime(1000);
					return webDriver.findElement(locator) != null;
				}
			});

			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public boolean isElementHidden(String cssSelector) {

		final By locator = By.cssSelector(cssSelector);
		waitUntilElementInvisible(locator, 5);
		return findElement(locator).isDisplayed();
	}

	// checks if element is Available
	public Boolean isElementAvailable(By locator) {
		waitUntilElementVisible(locator, 2);
		List<WebElement> elems = findElements(locator);
		if (elems.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

	// Waits until element is visible for TimeOuts
	public void waitUntilElementVisible(final By locator, int timeOutInSeconds) {
		try {
			wait = new WebDriverWait(getDriverProvider().get(), timeOutInSeconds);

			wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver webDriver) {
					System.out.println("waiting...");
					sleepTime(100);
					return webDriver.findElement(locator) != null;
				}
			});

		} catch (TimeoutException e) {

		}
	}

	public void waitUntilElementVisible(final WebElement elem, int timeOutInSeconds) {
		try {
			wait = new WebDriverWait(getDriverProvider().get(), timeOutInSeconds);
			wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver webDriver) {
					System.out.println("waiting...");
					sleepTime(100);
					return elem != null;
				}
			});

		} catch (TimeoutException e) {

		}
	}

	public void hoverOver(WebElement elem) {
		waitUntilElementVisible(elem, 3);
		try {
			Actions action = new Actions(getDriverProvider().get());
			action.moveToElement(elem).build().perform();
		} catch (org.openqa.selenium.WebDriverException e) {
			jsHoverOver(elem);
		}

	}

	public void hoverOver(By locator) {
		waitUntilElementVisible(locator, 3);
		final WebElement we = findElement(locator);
		wait = new WebDriverWait(getDriverProvider().get(), 10);

		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver webDriver) {
				System.out.println("waiting...");
				return we != null;
			}
		});

		try {
			Actions action = new Actions(getDriverProvider().get());

			action.moveToElement(we).build().perform();
		} catch (org.openqa.selenium.WebDriverException e) {
			jsHoverOver(we);
		}

	}

	public void navigateBack() {
		try {
			navigate().back();
		} catch (org.openqa.selenium.WebDriverException e) {
			((JavascriptExecutor) getDriverProvider().get()).executeScript("history.go(-1)");
		}
	}

	public boolean verifyRedirectedToUrl(String url) {
		sleepTime(2000);
		url = url.toLowerCase().trim() + "Page";

		return Selectors.getProperty(url).equals(getCurrentUrl().toString().trim());
	}

	public boolean verifyElementDisplaysWithText(String element, String text) {

		if (text.contains("'")) {
			text = text.substring(0, text.indexOf("'"))
					+ Selectors.getProperty(text.substring(text.indexOf("'") + 1, text.lastIndexOf("'")));
		}
		waitUntilElementVisible(Selectors.getElement(element), 5);
		return findElement(Selectors.getElement(element)).getText().trim().equals(text.trim());
	}

	public void WaitPageToLoad() {
		boolean pageLoaded = false;
		int counter = 0;
		while (!pageLoaded) {
			System.out.println(counter);
			if (counter == 30 || executeScript("return document.readyState").toString().equals("complete")) {

				//////// to stop the browser loading //
				//////// executeScript("window.stop();");
				pageLoaded = true;

			}
			counter++;
		}
	}

	public void clickOnElement(String element) {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 40);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
	}

	public void enterText(String element, String text) {
		waitElementToBeVisible(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(text);
	}

	public void waitElementToBeVisible(String element) {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 40);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));

	}

	public void sleepTime(int timeInSecond) {
		try {
			Thread.sleep(timeInSecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
