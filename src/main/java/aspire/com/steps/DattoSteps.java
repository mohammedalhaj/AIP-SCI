package aspire.com.steps;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.PageFactory;
import jo.aspire.generic.SoftAssert;

public class DattoSteps extends BaseSteps {

	public DattoSteps() {
		super();
	}

	public DattoSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@When("close subscribe popup")
	@Then("close subscribe popup")
	public void clickOnElement() {
		getDattoPage().clickOnElement("subscribeXbutton");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@When("I enter invalid email address")
	public void enterInvalidEmail() {
		getDattoPage().enterInvalidEmail();
	}

	@Then("I verify that filter work properly")
	public void eventFilter() {
		getDattoPage().eventFilter();
	}

	@Then("I verify search works properly")
	public void searchFunctionality() {
		boolean isFunctional = getDattoPage().searchFunctionality();
		SoftAssert.softAssertThat(isFunctional, Matchers.equalTo(true));

	}

}
