package aspire.com.steps;

import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.PageFactory;

public class SitationSteps extends BaseSteps {

	public SitationSteps() {
		super();
	}

	public SitationSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@cucumber.api.java.en.Given("I am on login page")
	@Given("I am on login page")
	public void GotoLoginPage() throws IOException {
		getScitationPage().go();
		// driver.WaitDOMToBeReady();
	}

	@When("I enter $username username and $password password")
	public void FillUsernameAndPassword(@Named("username") String username, @Named("password") String password)
			throws IOException {
		getScitationPage().Login(username, password);

	}

	@Given("user login with $vlaidUsername user name and $validPassword password.")
	@When("user login with $vlaidUsername user name and $validPassword password.")
	@Then("user login with $vlaidUsername user name and $validPassword password.")
	public void Login(@Named("username") String username, @Named("password") String password) throws IOException {
		// driver.DeleteCookies();
		getScitationPage().WaitElementToAppear(10, "username");
		getScitationPage().WaitElementToAppear(10, "password");
		getScitationPage().Login(username, password);
	}

	@Given("The $Actual should be $Expected")
	@When("The $Actual should be $Expected")
	@Then("The $Actual should be $Expected")
	public void Assert(@Named("Actual") String Actual, @Named("Expected") String Expected) throws IOException {
		getScitationPage().assertResult(Actual, Expected);
	}
	
	@When("page URL should be $Page_URL")
	@Then("page URL should be $Page_URL")
	public void Assert(@Named("Page_URL") String Page_URL) throws IOException {
		getScitationPage().getURL(Page_URL);
	}

	@Given("I am On $PageURL")
	public void GotoPage(String PageURL) throws IOException {
		getScitationPage().GoFor(PageURL);
		// driver.WaitDOMToBeReady();
	}
		
	@When("URL page sholud be $Page_Url")
	@Then("URL page sholud be $Page_Url")
	public void AssertUrl(@Named("Page_URL") String Page_URL) throws IOException{
		getScitationPage().goToUrl(Page_URL);
	}
	
	
	@Given("I Fill $Value to : $selector")
	@When("I Fill $Value to : $selector")
	public void fillDynamicVal(@Named("Val") String value, @Named("ele") String element) throws IOException {
		getScitationPage().enterValueToTextBox(element, value);
	}

	@Given("I click on $element")
	@When("I click on $element")
	@Then("I click on $element")
	public void clickOnElement(@Named("element") String element) throws IOException, Exception {
		getScitationPage().clickOnAnElement(element);
	}
	
	@When("I Use Robot")
	public void useRobot() throws Exception{
		getScitationPage().useRopot();
	}
	

	@Given("I Click On $element")
	@When("I Click On $element")
	@Then("I Click On $element")
	public void clickOnElementUsingJS(@Named("element") String element) throws IOException {
		getScitationPage().clickOnElementUsingJS(element);
	}

	@Given("The $element should display")
	@When("The $element should display")
	@Then("The $element should display")
	public void Browse(@Named("element") String element) throws IOException {
		getScitationPage().displaysElement(element);
	}
	
	@When("The $element should hide")
	@Then("The $element should hide")
	public void hide(@Named("element") String element) throws IOException {
		getScitationPage().hideElement(element);
	}

	@Given("I select one of $element")
	@When("I select one of $element")
	@Then("I select one of $element")
	public void SelectFromList(@Named("element") String element) throws IOException {
		getScitationPage().SelectFromList(element);
	}

	@Given("I scroll To $element")
	@When("I scroll To $element")
	@Then("I scroll To $element")
	public void scrollToElement(@Named("element") String element) throws IOException {
		getScitationPage().scrollToElement(element);
	}

	@Then("I check Clicking On $elemnt lead to the appropriate pages")
	public void checkLink(String elemnt) throws IOException {
		getScitationPage().checkHyperLinkNavigation(elemnt);
	}

	@Then("I switch tabs")
	@When("I switch tabs")
	public void switchTabs() throws IOException {
		getScitationPage().switchTabs();
	}

	@Given("I Choose one of TOC Browse volumes")
	@When("I Choose one of TOC Browse volumes")
	@Then("I Choose one of TOC Browse volumes")
	public void TOCBrowsevolumes() throws IOException {
		getScitationPage().TOCBrowsevolumes();
	}

	@When("The $element should Not display")
	@Then("The $element should Not display")
	public boolean CheckElementNotDisplays(@Named("element") String element) throws IOException {
		return getScitationPage().CheckElementNotDisplays(element);
	}

	@When("The $ElementList Should be $text")
	@Then("The $ElementList Should be $text")
	public void CheckElementListText(@Named("ElementList") String ElementList, @Named("text") String text)
			throws IOException {
		getScitationPage().CheckElementListText(ElementList, text);
	}

	@When("The $Name publisher Logo Should Dispaly")
	@Then("The $Name publisher Logo Should Dispaly")
	public void CheckPublishersLogo(@Named("Name") String Name) throws IOException {
		getScitationPage().CheckPublishersLogo(Name);
	}

	@When("I click On PDF and PDF Should open properly")
	@Then("I click On PDF and PDF Should open properly")
	public void PDFopenProperly() throws IOException {
		getScitationPage().PDFopenProperly();
	}

	@When("I Check The $selector Title Text")
	@Then("I Check The $selector Title Text")
	public void getText(String selector) throws IOException {
		getScitationPage().getText(selector);
	}

	@When("I compair the Publication Title with $selector")
	@Then("I compair the Publication Title with $selector")
	public void CompareElementsText(String selector) throws IOException {
		getScitationPage().CompareElementsText(selector);
	}

	@When("I Fill Registration form")
	@Then("I Fill Registration form")
	public void FillRegistrationForm() throws IOException {
		getScitationPage().FillRegistrationForm();
	}

	@Given("I am on RegistrationPage")
	public void Nothing() {

	}
	
	@When("I hover over $element")
	@Then("I hover over $element")
	public void hoverOverElement(@Named("element") String element) throws IOException, Exception {
		getScitationPage().hoverOverElement(element);
	}
	
	@When("I switch to frame $element")
	@Then("I switch to frame $element")
	public void switchToFrame(@Named("element") String element) throws IOException, Exception {
		getScitationPage().SwitchToIframe(element);
		
	}
	
	
	@When("I switch to window")
	@Then("I switch to window")
	public void switchToWindow() throws IOException {
		getScitationPage().switchWindows();
	}


}
