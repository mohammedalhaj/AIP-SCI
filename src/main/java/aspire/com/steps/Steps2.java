package aspire.com.steps;

import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.parosproxy.paros.network.HttpMessage;
import org.zaproxy.zap.CustomProxyListener;

import aspire.com.pages.PageFactory;

public class Steps2 extends BaseSteps {

	public Steps2() {
		super();
	}

	public Steps2(PageFactory pageFactory) {
		super(pageFactory);
	}

//	@cucumber.api.java.en.Given("I am on login page")
//	@Given("I am on login page")
//	public void BrightspotLoginPage() throws IOException {
//		// getStepsPage().logUserOut();
//		getStepsPage().go();
//
//		System.out.println("######################################################hooolaaa");
//		for (HttpMessage msg : CustomProxyListener.allRequests) {
//			System.out.println(msg.getRequestHeader().getURI().toString());
//		}
//		System.out.println("######################################################hooolaaa");
//
//	}

	@cucumber.api.java.en.Given("I am on kargo login page")
	@Given("I am on kargo login page")
	public void login2Kargo() throws IOException {
		getStepsPage().go2kargo();
	}

	@Given("I am on kargo login page FF")
	public void login2KargoFF() throws IOException, InterruptedException {
		getStepsPage().goFF();
	}

	@When("I navigate to site list page")
	public void login2KargoSitelist() throws IOException, InterruptedException {
		getStepsPage().login2KargoSitelist();
	}

	@When("I click on $element")
	public void onelement(@Named("element") String element) throws IOException {
		getStepsPage().clickOnElement(element);
	}

	@When("wait for sec")
	public void sleep() throws InterruptedException {
		Thread.sleep(4000);
	}

	@When("Click on close and do some functionalities with the alert")
	public void alert() throws IOException, InterruptedException {
		getStepsPage().alert();
	}

	@Given("I do nothing")
	public void test() throws IOException {
	}

	@When("I fill user name")
	public void fillUN() throws InterruptedException {
		getStepsPage().fillUN();
	}

	@When("Get value from another story")
	public void getVal() throws InterruptedException {
		getStepsPage().getVal();
	}

	@When("I fill PW")
	public void fillPW() throws InterruptedException {
		getStepsPage().fillPW();
	}

	@Given("user login with '$username' user name and '$password' password.")
	public void Login(@Named("username") String username, @Named("password") String password)
			throws IOException, InterruptedException {

		System.out.println("######################################################hooolaaa");
		for (HttpMessage msg : CustomProxyListener.allRequests) {
			System.out.println(msg.getRequestHeader().getURI().toString());
		}
		System.out.println("######################################################hooolaaa");

	}

}
