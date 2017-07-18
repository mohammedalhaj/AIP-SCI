package aspire.com.steps;

import java.io.IOException;
import java.sql.SQLException;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.Narrative;
import org.parosproxy.paros.network.HttpMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.zaproxy.zap.CustomProxyListener;

import aspire.com.pages.*;
import cucumber.api.java.Before;

import static org.hamcrest.MatcherAssert.assertThat;

public class Steps extends BaseSteps {

	public Steps() {
		super();
	}

	public Steps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@Before
	public void beforeCucmberScenario() {
		System.out.println("ttt");
	}

	@cucumber.api.java.en.When("I test logger with DB")
	@When("I test logger with DB")
	public void testLog() throws ClassNotFoundException, SQLException {
		getStepsPage().testLogger();
	}

	@cucumber.api.java.en.Given("I am on login page")
	@Given("I am on login page")
	public void BrightspotLoginPage() throws IOException {
		// getStepsPage().logUserOut();
		getStepsPage().go();

		System.out.println("######################################################hooolaaa");
		for (HttpMessage msg : CustomProxyListener.allRequests) {
			System.out.println(msg.getRequestHeader().getURI().toString());
		}
		System.out.println("######################################################hooolaaa");

	}

	@Given("I am on kargo login page")
	public void login2Kargo() {
		getStepsPage().go2kargo();
	}

	@Given("navigate to $name page")
	public void navigateTo(String name) {
		getStepsPage().navigateTo(name);
	}

	@Given("I am on kargo login page FF")
	public void login2KargoFF() {
		getStepsPage().goFF();
	}

	@When("I navigate to site list page")
	public void login2KargoSitelist() {
		getStepsPage().login2KargoSitelist();
	}

//	@When("I click on $element")
//	@Then("I click on $element")
//	public void onElement(@Named("element") String element) {
//		getStepsPage().clickOnElement(element);
//	}

	@When("Click on close and do some functionalities with the alert")
	public void alert() {
		try {
			getStepsPage().alert();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("I do nothing")
	public void test() {
	}

	@When("I fill user name")
	public void fillUN() {
		getStepsPage().fillUN();
	}

	@When("Get value from another story")
	public void getVal() {
		getStepsPage().getVal();
	}

	@When("I fill PW")
	public void fillPW() {
		getStepsPage().fillPW();
	}

	@Given("user login with '$username' user name and '$password' password.")
	public void Login(@Named("username") String username, @Named("password") String password) {

		System.out.println("######################################################hooolaaa");
		for (HttpMessage msg : CustomProxyListener.allRequests) {
			System.out.println(msg.getRequestHeader().getURI().toString());
		}
		System.out.println("######################################################hooolaaa");

	}

	@When("enter $text in $element")
	public void fillElementWithText(String text, String element) {
		getStepsPage().enterText(element, text);
	}

}
