package aspire.com.steps;

import java.sql.SQLException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.parosproxy.paros.network.HttpMessage;
import org.zaproxy.zap.CustomProxyListener;

import aspire.com.pages.PageFactory;
import cucumber.api.java.Before;

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
	public void BrightspotLoginPage() {
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



	@When("Click on close and do some functionalities with the alert")
	public void alert() {
		getStepsPage().alert();
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
		Assert.assertTrue(false);
	}

}
