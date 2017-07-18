package aspire.com.steps;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Then;

import aspire.com.pages.*;
import jo.aspire.generic.SoftAssert;

public class SearchSteps extends BaseSteps {

	public SearchSteps() {
		super();
	}

	public SearchSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@Then("I verify search works properly")
	public void searchFunctionality() {
		boolean isFunctional=getSearchPage().searchFunctionality();
		SoftAssert.softAssertThat(isFunctional, Matchers.equalTo(true));
		
	}

}
