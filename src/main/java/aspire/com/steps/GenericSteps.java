package aspire.com.steps;

import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.PageFactory;
import jo.aspire.generic.SoftAssert;

public class GenericSteps extends BaseSteps {

	public GenericSteps() {
		super();
	}

	public GenericSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@Given("I am at homepage and logged out")
	public void goToHomePageLoggedOut() {
		getGenericPage().go("http://www.datto.com");
	}

	@When("I verify $element displays")
	@Then("I verify $element displays")
	public void verifyElementIsDisplay(String element) {
		getGenericPage().isElementVisible(Selectors.getElement(element));
		boolean elementDisplayed = getGenericPage().isElementVisible(Selectors.getElement(element));
		SoftAssert.softAssertThat(elementDisplayed, Matchers.equalTo(true));
	}

	@When("$element Displays")
	public void ElementIsDisplays(String element) {
		getGenericPage().isElementVisible(Selectors.getElement(element));
		boolean elementDisplayed = getGenericPage().isElementVisible(Selectors.getElement(element));
		SoftAssert.softAssertThat(elementDisplayed, Matchers.equalTo(true));
	}

	@When("I Verify $element not displays")
	@Then("I Verify $element not displays")
	public void verifyElementNotDisplays(String element) {
		boolean elementDisplayed = getGenericPage().isElementHidden(element);
		SoftAssert.softAssertThat(elementDisplayed, Matchers.equalTo(false));
	}

	@When("user is redirected to $url page")
	@Then("user is redirected to $url page")
	public void verifyRedirectedToUrl(String url) {
		boolean currentUrlShouldEqual = getGenericPage().verifyRedirectedToUrl(url);
		SoftAssert.softAssertThat(currentUrlShouldEqual, Matchers.equalTo(true));
	}

	@When("I verify $element display as $text")
	@Then("I verify $element display as $text")
	public void verifyElementDisplaysWithText(String element, String text) {
		getGenericPage().verifyElementDisplaysWithText(element, text);

		boolean isElementWithText = getGenericPage().verifyElementDisplaysWithText(element, text);
		SoftAssert.softAssertThat(isElementWithText, Matchers.equalTo(true));

	}

	@Then("Assert False")
	public void assertFalse() {
		assertTrue(false);
	}

	@When("page is fully loaded")
	public void waitPageToLoad() {
		getGenericPage().WaitPageToLoad();
	}

	@When("I click on $element")
	@Then("I click on $element")
	public void onElement(@Named("element") String element) {
		getStepsPage().clickOnElement(element);
	}
}
