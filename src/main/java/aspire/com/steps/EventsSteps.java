package aspire.com.steps;

import org.jbehave.core.annotations.*;

import aspire.com.pages.*;

public class EventsSteps extends BaseSteps {

	public EventsSteps() {
		super();
	}

	public EventsSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@Then("I verify that filter work properly")
	public void eventFilter() {
		getEventPage().eventFilter();
	}
	
}
