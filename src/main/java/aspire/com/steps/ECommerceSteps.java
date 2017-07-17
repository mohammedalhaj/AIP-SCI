package aspire.com.steps;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import aspire.com.pages.PageFactory;
import aspire.ecommerce.entities.InformationBilingAddress;
import excelpages.WriteXLSX;
import jo.aspire.generic.StateHelper;

public class ECommerceSteps extends BaseSteps {

	public ECommerceSteps() {
		super();
	}

	public ECommerceSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@Given("I'm on Ecommerce page.")
	@Then("I'm on Ecommerce page.")
	// @Alias("Navigate to Ecommerce page.")
	public void navigateToLoginPage() {
		// StateHelper.setApplicationState("firstRun", "true");
		// pageFactory.resetPages();
		pageFactory.ECommercePage().navigateToLoginPage();
	}

	@Given("On 'HomePage' page -  I fill search field $SearchTerm.")
	@When("On 'HomePage' page -  I fill search field $SearchTerm.")
	@Then("On 'HomePage' page -  I fill search field $SearchTerm.")
	// @Alias("Fill search field from excel sheet.")
	public void fillSearchField(@Named("SearchTerm") String SearchTerm) {
		pageFactory.readeExcelSheet().selectSKU_ForSearch();
		String sku_number = pageFactory.readeExcelSheet().getSKU();
		pageFactory.ECommercePage().fillSearchField(sku_number);
		StateHelper.setStoryState("RandomlySKU", sku_number);
	}

	public void waitingForCartToDisplay() {

		assertThat(pageFactory.ECommercePage().waitElementToBeVisible("miniCartTotalText", 30), Matchers.is(true));
	}

	@Given("On 'Product Details' page - I click on 'Add to Cart' button.")
	@When("On 'Product Details' page - I click on 'Add to Cart' button.")
	@Then("On 'Product Details' page - I click on 'Add to Cart' button.")
	@Alias("Click on  Add to Cart button.")
	public void clickOnAddToCartButton() {
		if (pageFactory.ECommercePage().addToCartButtonText1().equalsIgnoreCase("Add to Cart")) {
			String ProductName = pageFactory.ECommercePage().getProductNameText();

			StateHelper.setStoryState("ProductName", ProductName);
			pageFactory.ECommercePage().clickOnAddToCart();

			waitingForCartToDisplay();
			String miniShowCartTotal = pageFactory.ECommercePage().getMiniCartTotalText();// miniShowCartTotal();
			StateHelper.setStoryState("CartTotal", miniShowCartTotal);
			System.err.println(miniShowCartTotal);

			String price = pageFactory.ECommercePage().getElementByCssSelector("productPriceText").getText().toString();
			StateHelper.setStoryState("price", price);

			String qty = pageFactory.ECommercePage().getElementByCssSelector("pdpQuntityField").getAttribute("value")
					.toString();
			StateHelper.setStoryState("qty", qty);

		} else {
			pageFactory.ECommercePage().clickOnAddToCart();

		}
	}

	@Given("On 'Product Details' page - I click on 'Go to Cart' button.")
	@When("On 'Product Details' page - I click on 'Go to Cart' button.")
	@Then("On 'Product Details' page - I click on 'Go to Cart' button.")
	@Alias("Click on  Go to Cart button.")
	public void clickOnGoToCartButton() {
		pageFactory.ECommercePage().sleepTime(2000);
		pageFactory.ECommercePage().clickOnGoToCart();
	}

	@Given("On 'Shopping Cart' page -  I check the shopping $CartText.")
	@When("On 'Shopping Cart' page -  I check the shopping $CartText.")
	@Then("On 'Shopping Cart' page -  I check the shopping $CartText.")
	public void checkShopingCartText(@Named("CART_TEXT") String cart_text) {
		assertThat(pageFactory.ECommercePage().getShoppingCartText().toString(),
				Matchers.equalToIgnoringCase(cart_text));
	}

	/// the Continue Checkout Button For Guest User
	@Given("On 'Shopping Cart' page -  I click on 'Continue Checkout' button.")
	@When("On 'Shopping Cart' page -  I click on 'Continue Checkout' button.")
	@Then("On 'Shopping Cart' page -  I click on 'Continue Checkout' button.")
	public void clickContinueCheckout() {

		pageFactory.ECommercePage().clickOnContinueCheckout();

	}

	@Given("On 'Billing & Shipping Address' page - I check the 'Billing & Shipping Address Text' <BILLING_SHIPPING>.")
	@When("On 'Billing & Shipping Address' page - I check the 'Billing & Shipping Address Text' <BILLING_SHIPPING>.")
	@Then("On 'Billing & Shipping Address' page - I check the 'Billing & Shipping Address Text' <BILLING_SHIPPING>.")
	public void checkBillingAndShippingAddresText(@Named("BILLING_SHIPPING") String billingShipping) {
		assertThat(pageFactory.ECommercePage().getbillingAndShippingAddresText(),
				Matchers.containsString(billingShipping));
	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_RECIPIENT> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_RECIPIENT> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_RECIPIENT> field.")
	public void fillRecipientField(@Named("GUEST_RECIPIENT") String recipient) {
		if (pageFactory.ECommercePage().getElementByCssSelector("recpientField").isDisplayed()) {
			pageFactory.ECommercePage().FillRecipientField(recipient);
		} else {
			System.err.println("Im a guest user the recipient name is not exist on Address page.");
		}

	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_FIRST_NAME> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_FIRST_NAME> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_FIRST_NAME> field.")
	public void fillFirstNameField(@Named("GUEST_FIRST_NAME") String firstName) {
		pageFactory.ECommercePage().fillFirstNameField(firstName);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_LAST_NAME> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_LAST_NAME> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_LAST_NAME> field.")
	public void fillLastElement(@Named("GUEST_LAST_NAME") String lastName) {
		pageFactory.ECommercePage().fillLastNameField(lastName);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_FIRST_STREET_ADDRESS> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_FIRST_STREET_ADDRESS> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_FIRST_STREET_ADDRESS> field.")
	public void fillFirstStreetField(@Named("GUEST_FIRST_STREET_ADDRESS") String firstStreetAddress) {
		pageFactory.ECommercePage().fillFirstStreetField(firstStreetAddress);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_SECOND_STREET_ADDRESS> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_SECOND_STREET_ADDRESS> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_SECOND_STREET_ADDRESS> field.")
	public void fillSecondStreetField(@Named("GUEST_SECOND_STREET_ADDRESS") String secondStreetAddress) {
		pageFactory.ECommercePage().fillSecondStreetField(secondStreetAddress);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_CITY> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_CITY> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_CITY> field.")
	public void fillCityField(@Named("GUEST_CITY") String city) {
		pageFactory.ECommercePage().fillCityField(city);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_COUNTRY> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_COUNTRY> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_COUNTRY> field.")
	public void openCountryList(@Named("GUEST_COUNTRY") String country) {
		pageFactory.ECommercePage().selectItemFromCountryDropDownList(country);
		StateHelper.setStoryState("GUEST_COUNTRY", country);
	}

	@Given("On 'Billing & Shipping Address' page -  I choose <GUEST_STATE> from dropdown list.")
	@When("On 'Billing & Shipping Address' page -  I choose <GUEST_STATE> from dropdown list.")
	@Then("On 'Billing & Shipping Address' page -  I choose <GUEST_STATE> from dropdown list.")
	public void openStateList(@Named("GUEST_STATE") String state) {

		String country = StateHelper.getStoryState("GUEST_COUNTRY").toString();
		if (country.equals("United States") || country.equals("Puerto Rico")) {

			pageFactory.ECommercePage().selectItemFromDropDownList(state);
		} else if (country.equals("Puerto Rico")) {
			pageFactory.ECommercePage().selectItemFromDropDownList(state);

		} else {
			pageFactory.ECommercePage().fillStateInputFeild(state);

		}
	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_ZIP_CODE> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_ZIP_CODE> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_ZIP_CODE> field.")
	public void clickOnNextBdutton(@Named("GUEST_ZIP_CODE") String zipCode) {
		pageFactory.ECommercePage().fiLLZipCodeField(zipCode);
	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_PHONE_NUMBER> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_PHONE_NUMBER> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_PHONE_NUMBER> field.")
	public void fillPhoneField(@Named("GUEST_PHONE_NUMBER") String phoneNumber) {
		pageFactory.ECommercePage().fillPhoneField(phoneNumber);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill <GUEST_EMAIL> field.")
	@When("On 'Billing & Shipping Address' page -  I fill <GUEST_EMAIL> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill <GUEST_EMAIL> field.")
	public void fillGuestEmailField(@Named("GUEST_EMAIL") String email) {
		pageFactory.ECommercePage().fillEmailField(email);

	}

	@Given("On 'Billing & Shipping Address' page -  I check 'Same as my billing address'checkbox.")
	@When("On 'Billing & Shipping Address' page -  I check 'Same as my billing address'checkbox.")
	@Then("On 'Billing & Shipping Address' page -  I check 'Same as my billing address'checkbox.")
	public void checkCheckBox() {
		pageFactory.ECommercePage().clickSameAddressCheckBox();
	}

	@Given("On 'Billing & Shipping Address' page -  I click on 'Next' button.")
	@When("On 'Billing & Shipping Address' page -  I click on 'Next' button.")
	@Then("On 'Billing & Shipping Address' page -  I click on 'Next' button.")
	public void clickOnNextButton() {
		pageFactory.ECommercePage().clickNextButton();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Given("I check the shopping <SHIPPING_INFORMATION>.")
	@Then("I check the shopping <SHIPPING_INFORMATION>.")
	public void checkTest(@Named("SHIPPING_INFORMATION") String shipping_information) {

		System.err.println("SHIPPING_INFORMATION" + shipping_information);
		String shoppingText = pageFactory.ECommercePage().ShippingInformation();
		assertThat(shoppingText, Matchers.equalToIgnoringCase(shipping_information));

		System.err.println("get SHIPPING_INFORMATION from site : " + shipping_information);

	}

	@Given("On 'Shipping And Billing Method' page - I check on the Addrss <GUEST_FIRST_NAME> and <GUEST_FIRST_NAME> and <GUEST_FIRST_STREET_ADDRESS> and <GUEST_SECOND_STREET_ADDRESS> and <GUEST_CITY> and <GUEST_STATE> and <GUEST_COUNTRY> and <GUEST_ZIP_CODE>.")
	@Then("On 'Shipping And Billing Method' page - I check on the Addrss <GUEST_FIRST_NAME> and <GUEST_FIRST_NAME> and <GUEST_FIRST_STREET_ADDRESS> and <GUEST_SECOND_STREET_ADDRESS> and <GUEST_CITY> and <GUEST_STATE> and <GUEST_COUNTRY> and <GUEST_ZIP_CODE>.")
	public void testtest(@Named("GUEST_FIRST_NAME") String firstName, @Named("GUEST_LAST_NAME") String lastName,
			@Named("GUEST_FIRST_STREET_ADDRESS") String firstStreetAddress,
			@Named("GUEST_SECOND_STREET_ADDRESS") String secondStreetAddress, @Named("GUEST_CITY") String city,
			@Named("GUEST_STATE") String state, @Named("GUEST_COUNTRY") String country,
			@Named("GUEST_ZIP_CODE") String zipCode
	// @Named("GUEST_PHONE_NUMBER") String phoneNumber
	) {

		String[] allInfoArray = pageFactory.ECommercePage().getAllData();

		assertThat(firstName + " " + lastName, Matchers.equalToIgnoringCase(allInfoArray[0].trim()));
		assertThat(firstStreetAddress + " " + secondStreetAddress,
				Matchers.equalToIgnoringCase(allInfoArray[1].trim()));
		assertThat(city.trim() + " " + state.trim(), Matchers.equalToIgnoringCase(allInfoArray[2].trim()));
		assertThat(country.trim() + " " + zipCode.trim(), Matchers.equalToIgnoringCase(allInfoArray[3].trim()));
		// assertThat(phoneNumber,Matchers.equalToIgnoringCase(allInfoArray[4].trim()));
	}

	@Given("On 'Homepage' page - I want to check that I'm in HomePage.")
	@When("On 'Homepage' page - I want to check that I'm in HomePage.")
	@Then("On 'Homepage' page - I want to check that I'm in HomePage.")
	@Alias("Check 'on' home'Pag'e.")
	public void checkHomePage() {
		assertThat(pageFactory.ECommercePage().getElementByCssSelector("carouselHomePageHeader").isDisplayed(),
				Matchers.is(true));

		System.err.println("im check ");
	}

	@When("On 'Homepage' page - I click on 'Manage Your Account' Link.")
	@Then("On 'Homepage' page - I click on 'Manage Your Account' Link.")
	@Alias("Click on  Manage Your Account Link.")
	public void clickOnManageYourAccountLink() {
		pageFactory.ECommercePage().clickOnManageYourAccountFooterLink();

	}

	@Given("On 'Sign In' page - I check I'm on $SignInText Page.")
	@Then("On 'Sign In' page - I check I'm on $SignInText Page.")
	@When("On 'Sign In' page - I check I'm on $SignInText Page.")
	@Alias("On Sign In page I check on $SignInText Page.")
	public void cheakSignInPage(@Named("SignInText") String signInText) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertThat(pageFactory.ECommercePage().getElementByCssSelector("signInPageText").getText().toString(),
				Matchers.equalToIgnoringCase(signInText));
	}

	@Given("On 'Sign In' page -  I Fill Username <USERNAME>.")
	@When("On 'Sign In' page -  I Fill Username <USERNAME>.")
	@Then("On 'Sign In' page -  I Fill Username <USERNAME>.")
	public void fillUserNameField(@Named("USERNAME") String userName) {
		System.err.println("for get ecxel sheet username :   ");
		pageFactory.readeExcelSheet().selectRandomRegisterUser();// selectTypeOfSheet();
		pageFactory.ECommercePage().fillUserNameField(pageFactory.readeExcelSheet().getUser());
		StateHelper.setStoryState("saveRecipientName", pageFactory.readeExcelSheet().getUser());
	}

	@Given("On 'Sign In' page -  I Fill Password <PASSWORD>.")
	@When("On 'Sign In' page -  I Fill Password <PASSWORD>.")
	@Then("On 'Sign In' page -  I Fill Password <PASSWORD>.")
	@Alias("Select Password from Execl sheet.")
	public void fillPASSWORDField(@Named("PASSWORD") String password) {
		pageFactory.ECommercePage().fillPasswordField(pageFactory.readeExcelSheet().getPass());

	}

	@Given("On 'Sign In' page - I click on the 'Sign In' button.")
	@When("On 'Sign In' page - I click on the 'Sign In' button.")
	@Then("On 'Sign In' page - I click on the 'Sign In' button.")
	@Alias("Click on the Sign In button.")
	public void clickOnSignInButton() {
		pageFactory.ECommercePage().logInButton();

	}

	@Given("On 'HomePage' page - I check that I logged in Successfully.")
	@When("On 'HomePage' page - I check that I logged in Successfully.")
	@Then("On 'HomePage' page - I check that I logged in Successfully.")
	@Alias("Check logged in shop Successfully.")
	public void clickOnMyAccount() {
		assertThat(pageFactory.ECommercePage().myAccountLinkText(), Matchers.is(true));
	}

	@Given("On 'Billing & Shipping Address' page -  I check Empty Field $ERROR_MESSAGE Message Text.")
	@Then("On 'Billing & Shipping Address' page -  I check Empty Field $ERROR_MESSAGE Message Text.")
	public void checkAlartErrorMessage(@Named("ERROR_MESSAGE") String errorMessage) {
		assertThat(pageFactory.ECommercePage().getAlartErrorMessageText(), Matchers.equalToIgnoringCase(errorMessage));
	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_FIRST_NAME_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_FIRST_NAME_Shipping> field.")
	public void fillFirstNameFieldShipping(@Named("GUEST_FIRST_NAME_Shipping") String firstName) {
		pageFactory.ECommercePage().fillFirstNameFieldShipping(firstName);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_LAST_NAME_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_LAST_NAME_Shipping> field.")
	public void fillLastElementShipping(@Named("GUEST_LAST_NAME_Shipping") String lastName) {
		pageFactory.ECommercePage().fillLastNameFieldShipping(lastName);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_FIRST_STREET_ADDRESS_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_FIRST_STREET_ADDRESS_Shipping> field.")
	public void fillFirstStreetFieldShipping(@Named("GUEST_FIRST_STREET_ADDRESS_Shipping") String firstStreetAddress) {
		pageFactory.ECommercePage().fillFirstStreetFieldShipping(firstStreetAddress);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_SECOND_STREET_ADDRESS_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_SECOND_STREET_ADDRESS_Shipping> field.")
	public void fillSecondStreetFieldShipping(
			@Named("GUEST_SECOND_STREET_ADDRESS_Shipping") String secondStreetAddress) {
		pageFactory.ECommercePage().fillSecondStreetFieldShipping(secondStreetAddress);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_CITY_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_CITY_Shipping> field.")
	public void fillCityFieldShipping(@Named("GUEST_CITY_Shipping") String city) {
		pageFactory.ECommercePage().fillCityFieldShipping(city);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_COUNTRY_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_COUNTRY_Shipping> field.")
	public void openCountryListShipping(@Named("GUEST_COUNTRY_Shipping") String country) {
		pageFactory.ECommercePage().selectItemFromCountryDropDownListShipping(country);

	}

	@Given("On 'Billing & Shipping Address' page -  I choose shipping <GUEST_STATE_Shipping> from dropdown list.")
	@Then("On 'Billing & Shipping Address' page -  I choose shipping <GUEST_STATE_Shipping> from dropdown list.")
	public void openStateListShipping(@Named("GUEST_STATE_Shipping") String state) {
		pageFactory.ECommercePage().selectItemFromDropDownListShipping(state);
	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_ZIP_CODE_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_ZIP_CODE_Shipping> field.")
	public void clickOnNextBduttonShipping(@Named("GUEST_ZIP_CODE_Shipping") String zipCode) {
		pageFactory.ECommercePage().fiLLZipCodeFieldShipping(zipCode);
	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_PHONE_NUMBER_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_PHONE_NUMBER_Shipping> field.")
	public void fillPhoneFieldShipping(@Named("GUEST_PHONE_NUMBER_Shipping") String phoneNumber) {
		pageFactory.ECommercePage().fillPhoneFieldShipping(phoneNumber);

	}

	@Given("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_EMAIL_Shipping> field.")
	@Then("On 'Billing & Shipping Address' page -  I fill shipping <GUEST_EMAIL_Shipping> field.")
	public void fillEmailFieldShipping(@Named("GUEST_EMAIL_Shipping") String email) {
		pageFactory.ECommercePage().fillEmailFieldShipping(email);

	}

	@Given("On 'Product Details' page - Fill 'Review Title'<Review_Title>.")
	@Then("On 'Product Details' page - Fill 'Review Title'<Review_Title>.")
	public void fillReviewTitleNameField(@Named("Review_Title") String reviewTitle) {
		pageFactory.ECommercePage().fillReviewTitleField(reviewTitle);
	}

	@Given("On 'Product Details' page -  click on 'Write a Review' button.")
	@When("On 'Product Details' page -  click on 'Write a Review' button.")
	@Then("On 'Product Details' page -  click on 'Write a Review' button.")
	public void clickOnWriteReview() {
		pageFactory.ECommercePage().clickOnBottomWriteReviewButton();
	}

	@Given("On 'Product Details' page - check 'My Review <MY_REVIEW> pop up.")
	@Then("On 'Product Details' page - check 'My Review <MY_REVIEW> pop up.")
	public void checkWriteReviewPopUp(@Named("MY_REVIEW") String myReview) {
		assertThat(pageFactory.ECommercePage().getWriteReviewPopUpText(), Matchers.containsString(myReview));
	}

	@Given("On 'Product Details' page - select star on 'OverAll Rating'.")
	@When("On 'Product Details' page - select star on 'OverAll Rating'.")
	@Then("On 'Product Details' page - select star on 'OverAll Rating'.")
	public void selectOverAllRatingField() {
		pageFactory.ECommercePage().fillOverAllRating();
	}

	@Given("On 'Product Details' page - Fill The 'Review'<Review>.")
	@Then("On 'Product Details' page - Fill The 'Review'<Review>.")
	public void fillReviewField(@Named("Review") String review) {
		pageFactory.ECommercePage().fillReviewField(review);
	}

	@Then("On 'Product Details' page - Fill 'Nick Name'<Nick_Name>.")
	public void fillNickNameField(@Named("Nick_Name") String nickName) {
		pageFactory.ECommercePage().fillNickNameField(nickName + (int) (1 + Math.random() * 1000));
	}

	@Then("On 'Product Details' page - Fill 'Email'<Email>.")
	public void fillEmailField(@Named("Email") String email) {
		pageFactory.ECommercePage().fillEmailField(email);
	}

	@Then("On 'Product Details' page - Fill 'Location' <Location>.")
	public void fillLocationField(@Named("Location") String location) {
		pageFactory.ECommercePage().fillLocationField(location);
	}

	@Then("On 'Product Details' page - check 'Agreement' checkbox.")
	public void checkAgreement() {
		pageFactory.ECommercePage().clickOnAgreementCheckbox();
	}

	@Then("On 'Product Details' page - click on 'Post Review' button.")
	public void clickOnPostReviewbutton() {
		pageFactory.ECommercePage().clickOnPostReviewButton();
	}

	@Then("On 'Product Details' page - check  'Review submitted'<REVIEW_SUBMITTED> button.")
	public void checkReviewSubmittedText(@Named("REVIEW_SUBMITTED") String reviewSubmitted) {
		assertThat(pageFactory.ECommercePage().getReviewSubmittedText(), Matchers.equalToIgnoringCase(reviewSubmitted));
	}

	@Given("On 'Shopping Cart' page I want remove all product item.")
	@When("On 'Shopping Cart' page I want remove all product item.")
	@Then("On 'Shopping Cart' page I want remove all product item.")
	@org.jbehave.core.annotations.Composite(steps = { "Then On 'Product Details' page - I click on 'Cart' link .",
			"When On 'HomePage' page - I click on 'Go To Cart' button.",
			"Then On 'Shopping Cart' page - I click on  Remove Link From Shopping Cart.",
			"Then On 'HomePage' page -  I click on the 'Weight Watchers' link." })
	public void removeAllProductItem() {

	}

	@Given("On 'Product Details' page -  I Update quantity $QUANTITY.")
	@Then("On 'Product Details' page -  I Update quantity $QUANTITY.")
	@When("On 'Product Details' page -  I Update quantity $QUANTITY.")
	public void fillQtyField(@Named("QUANTITY") String quantity) {
		pageFactory.ECommercePage().fillQtyField(quantity);
	}

	@Given("On 'Product Details' page - I check $CART_POPUP popup displays.")
	@When("On 'Product Details' page - I check $CART_POPUP popup displays.")
	@Then("On 'Product Details' page - I check $CART_POPUP popup displays.")

	public void checkAddToCartPopUp(@Named("CART_POPUP") String cartPopUp) {
		assertThat(pageFactory.ECommercePage().waitElementToBeVisible("miniCartTotalText", 60), Matchers.is(true));
		assertThat(pageFactory.ECommercePage().getElementByCssSelector("topMiniCartText").getText().toString(),
				Matchers.equalToIgnoringCase(cartPopUp));
	}

	@Given("On 'Shopping Cart' page - I want verify from Add Product.")
	@When("On 'Shopping Cart' page - I want verify from Add Product.")
	@Then("On 'Shopping Cart' page - I want verify from Add Product.")
	public void checkAddProduct() {
	}

	@Given("On 'Shipping Information' page -  I check the shopping <SHIPPING_INFORMATION> and <GUEST_FIRST_NAME> and <GUEST_LAST_NAME> and <GUEST_FIRST_STREET_ADDRESS> and <GUEST_SECOND_STREET_ADDRESS> and <GUEST_CITY> and <GUEST_STATE> and <GUEST_ZIP_CODE>.")
	@When("On 'Shipping Information' page -  I check the shopping <SHIPPING_INFORMATION> and <GUEST_FIRST_NAME> and <GUEST_LAST_NAME> and <GUEST_FIRST_STREET_ADDRESS> and <GUEST_SECOND_STREET_ADDRESS> and <GUEST_CITY> and <GUEST_STATE> and <GUEST_ZIP_CODE>.")
	@Then("On 'Shipping Information' page -  I check the shopping <SHIPPING_INFORMATION> and <GUEST_FIRST_NAME> and <GUEST_LAST_NAME> and <GUEST_FIRST_STREET_ADDRESS> and <GUEST_SECOND_STREET_ADDRESS> and <GUEST_CITY> and <GUEST_STATE> and <GUEST_ZIP_CODE>.")
	public void checkShippingInformationGuest(@Named("SHIPPING_INFORMATION") String shipping_information,
			@Named("GUEST_FIRST_NAME") String firstName, @Named("GUEST_LAST_NAME") String lastName,
			@Named("GUEST_FIRST_STREET_ADDRESS") String firstStreetAddress,
			@Named("GUEST_SECOND_STREET_ADDRESS") String secondStreetAddress, @Named("GUEST_CITY") String city,
			@Named("GUEST_STATE") String state,
			// @Named("GUEST_COUNTRY") String country,
			@Named("GUEST_ZIP_CODE") String zipCode) {

		assertThat(pageFactory.ECommercePage().ShippingInformation(),
				Matchers.equalToIgnoringCase(shipping_information));
		System.err.println("first assert:");
		String[] allInfoArray = pageFactory.ECommercePage().getAllData();
		assertThat(firstName + " " + lastName, Matchers.equalToIgnoringCase(allInfoArray[0].trim()));
		assertThat(firstStreetAddress + " " + secondStreetAddress,
				Matchers.equalToIgnoringCase(allInfoArray[1].trim()));
		assertThat(city.trim() + " " + state.trim(), Matchers.equalToIgnoringCase(allInfoArray[2].trim()));
		// assertThat(country.trim() + " " + zipCode.trim(),
		// Matchers.equalToIgnoringCase(allInfoArray[3].trim()));
		// assertThat(phoneNumber,Matchers.equalToIgnoringCase(allInfoArray[4].trim()));
	}

	@Given("On 'Billing & Shipping Method' page -  I fill <CARD_NUMBER> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill <CARD_NUMBER> field.")
	@When("On 'Billing & Shipping Method' page -  I fill <CARD_NUMBER> field.")
	public void fillCardNumberField(@Named("CARD_NUMBER") final String cardNumber) {
		pageFactory.ECommercePage().selectInvalidMonth("12");

		pageFactory.ECommercePage().fillCardNumberField(cardNumber);

	}

	@Given("On 'Billing & Shipping Method' page -  I choose <CRIDET_CARD> item.")
	@When("On 'Billing & Shipping Method' page -  I choose <CRIDET_CARD> item.")
	@Then("On 'Billing & Shipping Method' page -  I choose <CRIDET_CARD> item.")
	public void chooseVisaItem(@Named("CRIDET_CARD") String creditCard) {

		pageFactory.ECommercePage().selectItemFromBillingMethod(creditCard);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("On 'Billing & Shipping Method' page -  I fill CC Card <CC_CARD_NUMBER> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill CC Card <CC_CARD_NUMBER> field.")
	@When("On 'Billing & Shipping Method' page -  I fill CC Card <CC_CARD_NUMBER> field.")
	public void fillCCCardNumberField(@Named("CC_CARD_NUMBER") final String cc_cardNumber) {
		pageFactory.ECommercePage().fillCCCardNumberField(cc_cardNumber);

	}

	@Given("On 'Billing & Shipping Method' page -  I click on 'Next' button in method page.")
	@When("On 'Billing & Shipping Method' page -  I click on 'Next' button in method page.")
	@Then("On 'Billing & Shipping Method' page -  I click on 'Next' button in method page.")
	public void clickOnNextButtonMethodPage() {

		String[] allInfoArray = pageFactory.ECommercePage().getAllData();
		StateHelper.setStoryState("firstAndLastName", allInfoArray[0].trim());
		StateHelper.setStoryState("streetAddress", allInfoArray[1].trim());
		StateHelper.setStoryState("cityAndState", allInfoArray[2].trim());
		StateHelper.setStoryState("countryAndZipCode", allInfoArray[3].trim());
		StateHelper.setStoryState("phoneNumber", allInfoArray[4].trim());
		pageFactory.ECommercePage().clickNextButtonMethodPage();
	}

	@Given("On 'Billing & Shipping Method' page - I check the Error Invalid Credit Card <ERROR_MESSAGE>.")
	@Then("On 'Billing & Shipping Method' page - I check the Error Invalid Credit Card <ERROR_MESSAGE>.")
	@When("On 'Billing & Shipping Method' page - I check the Error Invalid Credit Card <ERROR_MESSAGE>.")
	public void checkerrorText(@Named("ERROR_MESSAGE") String errorText) {
		assertThat(pageFactory.ECommercePage().errorMessageText().toString(), Matchers.containsString(errorText));
	}

	@Given("On 'Order Summary' page - I check the Order Summary Text $OrderSummary.")
	@When("On 'Order Summary' page - I check the Order Summary Text $OrderSummary.")
	@Then("On 'Order Summary' page - I check the Order Summary Text $OrderSummary.")
	public void checkOrderSummaryText(@Named("ORDER_SUMMARY") String order_samary) {
		assertThat(pageFactory.ECommercePage().getOrderSummaryText(), Matchers.equalToIgnoringCase(order_samary));
	}

	@Given("On 'Order Summary' page - I click on 'Submit' button.")
	@When("On 'Order Summary' page - I click on 'Submit' button.")
	@Then("On 'Order Summary' page - I click on 'Submit' button.")
	public void clickOnSubmitButton() {
		pageFactory.ECommercePage().clickSubmitButtonOrderSummary();

	}

	@Given("On 'HomePage' page -  I click on the $item category")
	@Then("On 'HomePage' page -  I click on the $item category")
	@When("On 'HomePage' page -  I click on the $item category")
	public void clickOnCategoryItem(@Named("item") String item) {

		StateHelper.setStoryState("Category", item);
		pageFactory.ECommercePage().clickOnCategoryItem(item);
	}

	@Given("On 'Product Details' page - I check I'm on $CategoryName category.")
	@Then("On 'Product Details' page - I check I'm on $CategoryName category.")
	@When("On 'Product Details' page - I check I'm on $CategoryName category.")
	public void checkCategoryName(@Named("CategoryName") String categoryName) {
		String nameOfCategory = categoryName.toLowerCase();
		assertThat(pageFactory.ECommercePage().getCategoryNameText().toLowerCase(),
				Matchers.containsString(nameOfCategory));

	}

	@Given("On 'Product Details' page - I click on $productName product.")
	@When("On 'Product Details' page - I click on $productName product.")
	@Then("On 'Product Details' page - I click on $productName product.")
	public void clickOnProductName(String productName) {
		System.err.println("Add to cart method:");
		List<WebElement> products = pageFactory.ECommercePage().getElementsByCssSelector("productsName");
		System.err.println("products" + products);
		Random number = new Random();
		System.err.println("products.size()====" + products.size());
		if (products.size() > 1) {
			int randomNumber = number.nextInt(products.size() - 1) + 0;
			System.err.println("randomNumber  ; " + randomNumber);
			StateHelper.setStoryState("ProductName", products.get(randomNumber).getText().toString().trim());
			products.get(randomNumber).click();
			System.err.println("Productname::" + pageFactory.ECommercePage().getProductNameText());
			StateHelper.setStoryState("ProductNameAfterSeletProduct", pageFactory.ECommercePage().getProductNameText());

		} else {
			System.err.println("products names:: " + products.get(0).getText());
			products.get(0).click();

		}
	}

	@Given("On 'Product Details' page - I want check Product Name.")
	@Then("On 'Product Details' page - I want check Product Name.")
	@When("On 'Product Details' page - I want check Product Name.")
	public void checkProductDetailsName() {

	}

	@Given("On 'Homepage' page - I click on the 'Login To Shop' link.")
	@When("On 'Homepage' page - I click on the 'Login To Shop' link.")
	@Alias("Clicking on the Login To Shop link.")
	public void clickOnLoginRegisterLink() {
		pageFactory.ECommercePage().clickOnLoginButton();
	}

	// Fill Member user pass be sheet
	@Given("On 'Sign In' page -  I Fill WW Username <USERNAME>.")
	@When("On 'Sign In' page -  I Fill WW Username <USERNAME>.")
	@Then("On 'Sign In' page -  I Fill WW Username <USERNAME>.")
	public void fillUserName(@Named("USERNAME") String userName) {
		pageFactory.readeExcelSheet().selectRandomMemberUser();// selectTypeOfSheetForMemeber();
		pageFactory.ECommercePage().fillUserNameField(pageFactory.readeExcelSheet().getUser());
	}

	@Given("On 'HomePage' page -  I click on 'MyAccount' link.")
	@Then("On 'HomePage' page -  I click on 'MyAccount' link.")
	@When("On 'HomePage' page -  I click on 'MyAccount' link.")
	public void clickOnMyAccountLink() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pageFactory.ECommercePage().clickOnMyAccountLink();
	}

	// Fill Member Password pass by example of excel Sheet
	@Given("On 'Sign In' page -  I Fill WW Password <PASSWORD>.")
	@When("On 'Sign In' page -  I Fill WW Password <PASSWORD>.")
	@Then("On 'Sign In' page -  I Fill WW Password <PASSWORD>.")
	public void fillPasswordField(@Named("PASSWORD") String password) {
		pageFactory.ECommercePage().fillPasswordField(pageFactory.readeExcelSheet().getPass());
	}

	@Given("On 'My Account' page - I check My Account <MY_ACCOUNT> Text.")
	@When("On 'My Account' page - I check My Account <MY_ACCOUNT> Text.")
	@Then("On 'My Account' page - I check My Account <MY_ACCOUNT> Text.")
	public void checkMyAccountText(@Named("MY_ACCOUNT") String myAccount) {
		assertThat(pageFactory.ECommercePage().checkMyAccountText(), Matchers.equalToIgnoringCase(myAccount));
	}

	@Given("On 'My Account' page - I click on 'Personal Wish List' link.")
	@When("On 'My Account' page - I click on 'Personal Wish List' link.")
	@Then("On 'My Account' page - I click on 'Personal Wish List' link.")
	public void clickOnPersonalWishListLink() {
		pageFactory.ECommercePage().clickOnPersonalWishList();
	}

	@Given("On 'My Account' page - I remove all products from wish list.")
	@When("On 'My Account' page - I remove all products from wish list.")
	@Then("On 'My Account' page - I remove all products from wish list.")
	public void removeAllItemFromWishList() {
		pageFactory.ECommercePage().removeAllProductsFromWishList();
	}

	@Given("On 'Product Details' page - I save product name.")
	@Then("On 'Product Details' page - I save product name.")
	@When("On 'Product Details' page - I save product name.")
	public void saveProductName() {
		StateHelper.setStoryState("saveProduct",
				pageFactory.ECommercePage().getElementByCssSelector("productNameText").getText().toString());
	}

	@Given("On 'Product Details' page - I click on 'Add to Wish List' Button.")
	@Then("On 'Product Details' page - I click on 'Add to Wish List' Button.")
	@When("On 'Product Details' page - I click on 'Add to Wish List' Button.")
	@Alias("On Product Details page I click on Add to Wish List Button.")

	public void clickOnAddToWishList() {
		pageFactory.ECommercePage().clickOnAddToWishList();
	}

	@Then("On 'Product Details' page - I check $ADD_TO_WISH_LIST Text.")
	@When("On 'Product Details' page - I check $ADD_TO_WISH_LIST Text.")
	public void checkAddToWishList(@Named("ADD_TO_WISH_LIST") String addToWishListText) {

		assertThat(pageFactory.ECommercePage().getAddToWishListText(), Matchers.equalToIgnoringCase(addToWishListText));
	}

	@When("On 'My Account' page - I check product name.")
	@Then("On 'My Account' page - I check product name.")
	public void checkProductName() {
		assertThat(StateHelper.getStoryState("saveProduct").toString(), Matchers
				.containsString(pageFactory.ECommercePage().getElementByCssSelector("productNameText").toString()));
	}

	@Then("On 'My Account' page - I click on 'Remove' Link")
	public void clickOnRemoveLink() {
		pageFactory.ECommercePage().clickOnRemove();
	}

	@Given("On 'HomePage' page -  I click on the 'Register' link.")
	@When("On 'HomePage' page -  I click on the 'Register' link.")
	@Then("On 'HomePage' page -  I click on the 'Register' link.")
	public void clickOnRegisterLink() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pageFactory.ECommercePage().clickOnRegisterButton();

	}

	@Given("On 'Register' page - I check the Register Text $REGISTER.")
	@When("On 'Register' page - I check the Register Text $REGISTER.")
	@Then("On 'Register' page - I check the Register Text $REGISTER.")
	public void checkRegisterText(@Named("CHECK_REGISTER") String check_register) {

		assertThat(pageFactory.ECommercePage().checkRegisterUserText().toString(),
				Matchers.equalToIgnoringCase(check_register));

	}

	@When("On 'Register' page - I Fill 'Username' Feild <RANDUSERNAME>.")
	@Then("On 'Register' page - I Fill 'Username' Feild <RANDUSERNAME>.")
	public void fillRandomUsernameField(@Named("RANDUSERNAME") String randUsername) {

		String newuser = randUsername + generateRandomNumber(10);
		System.err.println(newuser.length());
		pageFactory.ECommercePage().fillUsernameField(newuser);
		StateHelper.setStoryState("LoginID", newuser);
	}

	public String generateRandomNumber(int length) {
		Random random = new Random();
		String number = "";
		for (int i = 0; i < length; i++) {
			number += random.nextInt(10) + 0;
		}
		return number;
	}

	@When("On 'Register' page - I Fill 'Password' Feild $PASSWORD.")
	@Then("On 'Register' page - I Fill 'Password' Feild <PASSWORD>.")
	public void fillPasswordField1(@Named("PASSWORD") String password) {
		pageFactory.ECommercePage().fillPassword(password);

	}

	@When("On 'Register' page - I Fill 'Confirm password' Feild $PASSWORD.")
	@Then("On 'Register' page - I Fill 'Confirm password' Feild <PASSWORD>.")
	public void fillConfirmPasswordField(@Named("PASSWORD") String password) {
		pageFactory.ECommercePage().fillConfirmPassword(password);
	}

	@When("On 'Register' page - I Fill 'First name' <FIRST_NAME>.")
	@Then("On 'Register' page - I Fill 'First name' <FIRST_NAME>.")
	public void fillFirstNameField1(@Named("FIRST_NAME") String first_name) {
		pageFactory.ECommercePage().fillFirstName(first_name);
	}

	@When("On 'Register' page - I Fill 'Last name' <LAST_NAME>.")
	@Then("On 'Register' page - I Fill 'Last name' <LAST_NAME>.")
	public void fillLastNameField1(@Named("LAST_NAME") String last_name) {
		pageFactory.ECommercePage().fillLastName(last_name);
	}

	@When("On 'Register' page - I Fill 'Street Address' <STREET_ADDRESS>.")
	@Then("On 'Register' page - I Fill 'Street Address' <STREET_ADDRESS>.")
	public void fillFirstStreetAddress(@Named("STREET_ADDRESS") String streetAddress) {
		pageFactory.ECommercePage().fillFirstStreetAddressFeild(streetAddress);
	}

	@When("On 'Register' page - I Fill 'City' <CITY>.")
	@Then("On 'Register' page - I Fill 'City' <CITY>.")
	public void fillCityFeild(@Named("CITY") String city) {
		pageFactory.ECommercePage().fillCityField(city);
	}

	@When("On 'Register' page - I choose State $STATE from dropdown list.")
	@Then("On 'Register' page - I choose <STATE> from dropdown list.")
	public void openStateList1(@Named("STATE") String state) {

		pageFactory.ECommercePage().clickOnStateFromDropDownList();
		List<WebElement> stateNames = pageFactory.ECommercePage().getElementsByCssSelector("stateListItems");
		for (int i = 0; i < stateNames.size(); i++) {
			WebElement stateName = stateNames.get(i);
			String stateNameText = stateName.getText().toString();
			if (stateNameText.equalsIgnoreCase(state)) {
				stateName.click();
				break;
			}
		}
	}

	@When("On 'Register' page - I Fill 'zip code' <ZIP_CODE>.")
	@Then("On 'Register' page - I Fill 'zip code' <ZIP_CODE>.")
	public void fillZipCodeField(@Named("ZIP_CODE") String zip_code) {
		pageFactory.ECommercePage().fillZipCode(zip_code);
	}

	@When("On 'Register' page - I Fill 'email' $EMAIL.")
	@Then("On 'Register' page - I Fill 'email' <EMAIL>.")
	public void fillEmailField1(@Named("EMAIL") String email) {
		pageFactory.ECommercePage().fillEmail(email);
	}

	@When("On 'Register' page - I Fill Phone Number <PHONE_NUMBER> Field.")
	@Then("On 'Register' page - I Fill Phone Number <PHONE_NUMBER> Field.")
	public void fillPhoneNumberField(@Named("PHONE_NUMBER") String phoneNumber) {
		pageFactory.ECommercePage().fillPhoneNumberField(phoneNumber);
	}

	@Then("On 'Register' page - I choose <GENDER> Gender.")
	@When("On 'Register' page - I choose $GENDER Gender.")
	public void chooseGenderList(@Named("GENDER") String gender) {
		pageFactory.ECommercePage().clickOnGenderList();
		List<WebElement> genderListItmes = pageFactory.ECommercePage().getElementsByCssSelector("genderListItmes");
		for (int i = 0; i < genderListItmes.size(); i++) {
			String genderListText = genderListItmes.get(i).getText().toString();
			if (genderListText.equalsIgnoreCase(gender)) {
				genderListItmes.get(i).click();
				break;
			}
		}

	}

	@When("On 'Register' page - I choose $YEAR Year from dropdown list.")
	@Then("On 'Register' page - I choose <YEAR> from dropdown list.")
	public void openYearList(@Named("YEAR") String year) {
		pageFactory.ECommercePage().clickOnYearFromDropDownList();
		List<WebElement> yearListItems = pageFactory.ECommercePage().getElementsByCssSelector("yearListItems");
		for (int i = 0; i < yearListItems.size(); i++) {
			String yearText = yearListItems.get(i).getText().toString();
			if (yearText.equalsIgnoreCase(year)) {
				yearListItems.get(i).click();
				break;
			}
		}

	}

	@When("On 'Register' page - I choose $MONTH Month from dropdown list.")
	@Then("On 'Register' page - I choose <MONTH> from dropdown list.")
	public void openMonthList(@Named("MONTH") String month) {
		pageFactory.ECommercePage().clickOnMonthFromDropDownList();
		List<WebElement> monthListItems = pageFactory.ECommercePage().getElementsByCssSelector("monthListItems");
		for (int i = 0; i < monthListItems.size(); i++) {
			String monthText = monthListItems.get(i).getText().toString();
			if (monthText.equalsIgnoreCase(month)) {
				monthListItems.get(i).click();
				break;
			}
		}

	}

	@When("On 'Register' page - I choose $DAY Day from dropdown list.")
	@Then("On 'Register' page - I choose <DAY> from dropdown list.")
	public void openDayList(@Named("DAY") String day) {

		pageFactory.ECommercePage().clickOnDayFromDropDownList();
		List<WebElement> dayListItems = pageFactory.ECommercePage().getElementsByCssSelector("dayListItems");
		for (int i = 0; i < dayListItems.size(); i++) {
			String dayText = dayListItems.get(i).getText().toString();
			if (dayText.equalsIgnoreCase(day)) {
				dayListItems.get(i).click();
				break;
			}
		}
	}

	@When("On 'Register' page - I click 'Submit' button.")
	@Then("On 'Register' page - I click 'Submit' button.")
	public void clickCompleteSignUp() {
		waitingForElements();
		pageFactory.ECommercePage().clickOnSubmitButton();

	}

	public void waitingForElements() {

		assertThat(pageFactory.ECommercePage().waitElementToBeVisible("submitButton", 30), Matchers.is(true));
	}

	@When("On 'Register' page - I check on Message Text $ERROR_MESSAGE.")
	@Then("On 'Register' page - I check on Message Text <ERROR_MESSAGE>.")
	public void checkOnEmptyFieldMessageText(@Named("ERROR_MESSAGE") String messagetext) {

		assertThat(pageFactory.ECommercePage().getAlertEmptyFieldText().toString(),
				Matchers.containsString(messagetext));

	}

	@Then("On 'Address Book' page - I want delete all address.")
	@Composite(steps = { "Then On 'HomePage' page -  I click on 'MyAccount' link.",
			"Then On 'My Account' page - I click on 'Address Book'link.",
			"Then On 'Address Book' page - I delete all address." })
	public void deleteAllAddress() {

	}

	@Given("On 'Shopping Cart' page -  I click on 'Continue Checkout' button For Login Users.")
	@Then("On 'Shopping Cart' page -  I click on 'Continue Checkout' button For Login Users.")
	@When("On 'Shopping Cart' page -  I click on 'Continue Checkout' button For Login Users.")
	public void clickContinueCheckoutLogInUser() {
		pageFactory.ECommercePage().clickOnContinueCheckoutLogInUser();
	}

	@Given("On 'Billing & Shipping Method' page - I check that I'm in the $SHIPPING_INFORMATION page.")
	@When("On 'Billing & Shipping Method' page - I check that I'm in the $SHIPPING_INFORMATION page.")
	@Then("On 'Billing & Shipping Method' page - I check that I'm in the $SHIPPING_INFORMATION page.")
	public void checkShippingInformationPage(@Named("SHIPPING_INFORMATION") String shipping_information) {

		waitingForShippingInformationToDisplay();
		assertThat(pageFactory.ECommercePage().ShippingInformation(),
				Matchers.equalToIgnoringCase(shipping_information));
	}

	public void waitingForShippingInformationToDisplay() {

		assertThat(pageFactory.ECommercePage().waitElementToBeVisible("shippingInformation", 30), Matchers.is(true));
	}

	@Given("On 'Billing & Shipping Method' page -  I click on 'Create New Shipping Address' link.")
	@When("On 'Billing & Shipping Method' page -  I click on 'Create New Shipping Address' link.")
	@Then("On 'Billing & Shipping Method' page -  I click on 'Create New Shipping Address' link.")
	public void clickOnCreateNewShippingAddress() {
		pageFactory.ECommercePage().createNewShippingAddressLink();
	}

	@Given("On 'Billing & Shipping Method' page -  I check the 'Create Address'<CREATE_ADDRESS>.")
	@When("On 'Billing & Shipping Method' page -  I check the 'Create Address'<CREATE_ADDRESS>.")
	@Then("On 'Billing & Shipping Method' page -  I check the 'Create Address'<CREATE_ADDRESS>.")
	public void checkCreateAdressText(@Named("CREATE_ADDRESS") String createAdress) {

		assertThat(pageFactory.ECommercePage().createAdressText(), Matchers.equalToIgnoringCase(createAdress));
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Recipient <NEW_RECIPIENT> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Recipient <NEW_RECIPIENT> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Recipient <NEW_RECIPIENT> field.")
	public void fillNewRecipientField(@Named("NEW_RECIPIENT") String recipient) {
		if (pageFactory.ECommercePage().getElementByCssSelector("newRecpientField").isDisplayed()) {

			Random rand1 = new Random(System.currentTimeMillis());
			int num = rand1.nextInt();
			String recipientAndRandomNumber = recipient + num;
			pageFactory.ECommercePage().fillNewRecipient(recipientAndRandomNumber);
			StateHelper.setStoryState("saveRecipientName", recipientAndRandomNumber);

		} else {

			System.err.println("Im a guest user the recipient name is not exist on create/edit address.");
		}

	}

	@Given("On 'Billing & Shipping Method' page -  I fill New First Name<NEW_FIRST_NAME> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New First Name<NEW_FIRST_NAME> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New First Name<NEW_FIRST_NAME> field.")
	public void fillNewFirstNameFeild(@Named("NEW_FIRST_NAME") String newFisrtName) {
		pageFactory.ECommercePage().fillNewFirstName(newFisrtName);
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Last Name<New_LAST_NAME> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Last Name<New_LAST_NAME> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Last Name<New_LAST_NAME> field.")
	public void fillNewLastName(@Named("New_LAST_NAME") String newLastName) {
		pageFactory.ECommercePage().fillNewLastName(newLastName);
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Fisrt Street Address<New_FIRST_STREET_ADDRESS> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Fisrt Street Address<New_FIRST_STREET_ADDRESS> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Fisrt Street Address<New_FIRST_STREET_ADDRESS> field.")
	public void fillNewFirstStreetAddressField(@Named("New_FIRST_STREET_ADDRESS") String address) {
		pageFactory.ECommercePage().fillNewFirstStreetAdress(address);
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Second Street<NEW_SECOND_STREET_ADDRESS> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Second Street<NEW_SECOND_STREET_ADDRESS> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Second Street<NEW_SECOND_STREET_ADDRESS> field.")
	public void fillNewSecondStreetAddressField(@Named("NEW_SECOND_STREET_ADDRESS") String address) {
		pageFactory.ECommercePage().fillNewSecondAddress(address);
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New City <NEW_CITY> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New City <NEW_CITY> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New City <NEW_CITY> field.")
	public void fillNewCityField(@Named("NEW_CITY") String city) {
		pageFactory.ECommercePage().fillNewCityField(city);
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Country <NEW_COUNTRY> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Country <NEW_COUNTRY> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Country <NEW_COUNTRY> field.")
	public void openNewCountryList(@Named("NEW_COUNTRY") String country) {
		System.err.println(country);
		pageFactory.ECommercePage().selectNewItemFromCountryDropDownList(country);
		StateHelper.setStoryState("CountryName", country);

	}

	@When("On 'Billing & Shipping Method' page -  I fill <ZIP_CODE> field.")
	@Given("On 'Billing & Shipping Method' page -  I fill <ZIP_CODE> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill <ZIP_CODE> field.")
	public void fillZipCode(@Named("ZIP_CODE") String zipCode) {
		pageFactory.ECommercePage().fiLLZipCodeField(zipCode);
	}

	@When("On 'Billing & Shipping Method' page -  I choose New State <NEW_STATE> from dropdown list.")
	@Given("On 'Billing & Shipping Method' page -  I choose New State <NEW_STATE> from dropdown list.")
	@Then("On 'Billing & Shipping Method' page -  I choose New State <NEW_STATE> from dropdown list.")
	public void openNewStateList(@Named("NEW_STATE") String state) {
		// pageFactory.shippingBillingMethodPage().newStateField(state);
		System.err.println(StateHelper.getStoryState("CountryName"));
		if (StateHelper.getStoryState("CountryName").equals("United States")) {
			System.err.println("United States");
			pageFactory.ECommercePage().selectNewState(state);
		} else if (StateHelper.getStoryState("CountryName").equals("Puerto Rico")) {
			System.err.println("Puerto Rico");
			pageFactory.ECommercePage().selectNewState(state);
		} else {
			System.err.println("i will fill");
			pageFactory.ECommercePage().fillState(state);
		}
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Zip Code <NEW_ZIP_CODE> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Zip Code <NEW_ZIP_CODE> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Zip Code <NEW_ZIP_CODE> field.")
	public void fillNewZipCodeField(@Named("NEW_ZIP_CODE") String zipCode) {
		pageFactory.ECommercePage().fillNewZipCode(zipCode);
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Phone Number <NEW_PHONE_NUMBER> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Phone Number <NEW_PHONE_NUMBER> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Phone Number <NEW_PHONE_NUMBER> field.")
	public void fillNewPhoneNumberField(@Named("NEW_PHONE_NUMBER") String phoneNumber) {
		pageFactory.ECommercePage().fillNewPhoneNumber(phoneNumber);
	}

	@Given("On 'Billing & Shipping Method' page -  I fill New Email <NEW_EMAIL> field.")
	@When("On 'Billing & Shipping Method' page -  I fill New Email <NEW_EMAIL> field.")
	@Then("On 'Billing & Shipping Method' page -  I fill New Email <NEW_EMAIL> field.")
	public void fillNewEmailField(@Named("NEW_EMAIL") String email) {
		pageFactory.ECommercePage().fillNewEmail(email);
	}

	@Given("On 'Billing & Shipping Method' page -  I click on 'Shipping and Billing Address' CheckBox.")
	@When("On 'Billing & Shipping Method' page -  I click on 'Shipping and Billing Address' CheckBox.")
	@Then("On 'Billing & Shipping Method' page -  I click on 'Shipping and Billing Address' CheckBox.")
	public void clickOnShippingAndBillingAddressCheckBox() {
		pageFactory.ECommercePage().clickOnShippingAndBillingAddress();
	}

	@Given("On 'Billing & Shipping Method' page -  I click on 'Submit' Button.")
	@When("On 'Billing & Shipping Method' page -  I click on 'Submit' Button.")
	@Then("On 'Billing & Shipping Method' page -  I click on 'Submit' Button.")
	public void clickOnSubmitButton1() {
		pageFactory.ECommercePage().submitButton();
	}

	@Then("On 'Billing & Shipping Method' page -  I check The New Shipping Address <NEW_FIRST_NAME> , <New_LAST_NAME> , <New_FIRST_STREET_ADDRESS> , <NEW_SECOND_STREET_ADDRESS> , <NEW_CITY> , <NEW_STATE> , <NEW_COUNTRY> , <NEW_ZIP_CODE> , <NEW_PHONE_NUMBER> , Text.")
	@Given("On 'Billing & Shipping Method' page -  I check The New Shipping Address <NEW_FIRST_NAME> , <New_LAST_NAME> , <New_FIRST_STREET_ADDRESS> , <NEW_SECOND_STREET_ADDRESS> , <NEW_CITY> , <NEW_STATE> , <NEW_COUNTRY> , <NEW_ZIP_CODE> , <NEW_PHONE_NUMBER> , Text.")
	public void checkNewShiipingAdderss(@Named("NEW_FIRST_NAME") String firstName,
			@Named("New_LAST_NAME") String lastName, @Named("New_FIRST_STREET_ADDRESS") String firstStreetAddress,
			@Named("NEW_SECOND_STREET_ADDRESS") String secondStreetAddress, @Named("NEW_CITY") String city,
			@Named("NEW_STATE") String state, @Named("NEW_COUNTRY") String country,
			@Named("NEW_ZIP_CODE") String zipCode) {

		String[] allInfoArray = pageFactory.ECommercePage().getAllShippingInformationData();

		assertThat(firstName + " " + lastName, Matchers.containsString(allInfoArray[0].trim()));

		assertThat(firstStreetAddress + " " + secondStreetAddress, Matchers.containsString(allInfoArray[1].trim()));

		assertThat(city.trim() + " " + state.trim(), Matchers.containsString(allInfoArray[2].trim()));

		assertThat(country.trim() + " " + zipCode.trim(), Matchers.containsString(allInfoArray[3].trim()));

	}

	@Given("On 'Thank You' page - I check Thank you for your order $ThankYou.")
	@When("On 'Thank You' page - I check Thank you for your order $ThankYou.")
	@Then("On 'Thank You' page - I check Thank you for your order $ThankYou.")
	public void checkThankYouOrderText(@Named("THANK_YOU") String thank_you) throws IOException {
		assertThat(pageFactory.ECommercePage().checkThankYouForYourOrderText().toString(),
				Matchers.equalToIgnoringCase(thank_you));
		String orderNumber = pageFactory.ECommercePage().orderNumberText();
		WriteXLSX.WriteOrderID(orderNumber);
		System.err.println(orderNumber);
	}

	@When("On 'Register' page - I check Error Message <ERROR_MESSAGE> Text.")
	@Then("On 'Register' page - I check Error Message $ERROR_MESSAGE Text.")
	public void checkErrorMessage(@Named("ERROR_MESSAGE") String errorMessage) {
		assertThat(pageFactory.ECommercePage().getRegistrationErrorMessagesText(),
				Matchers.containsString(errorMessage)); /// containsString
	}

	@Then("On 'HomePage' page - I vertify All Products.")
	public void checkOnAllProducts() {
		pageFactory.ECommercePage().clickOnWeightWatchersLink();
		List<WebElement> productName = pageFactory.ECommercePage().getElementsByCssSelector("homePageProduct");
		System.err.println("productName.size() " + productName.size());
		// productName.size()
		for (int i = 0; i < 12; i++) {

			if (pageFactory.ECommercePage().getProductNameFromHomePagebyIndex(i).isEmpty()) {

				pageFactory.ECommercePage().clickOnNextLinkOnHomePage();
				String nameOfProduct = pageFactory.ECommercePage().getProductNameFromHomePagebyIndex(i);
				pageFactory.ECommercePage().clickOnProductNameFromHomePagebyIndex(i);
				assertThat(nameOfProduct, Matchers.equalTo(pageFactory.ECommercePage().getProductNameText()));
				pageFactory.ECommercePage().clickOnWeightWatchersLink();
			} else {

				String nameOfProduct = pageFactory.ECommercePage().getProductNameFromHomePagebyIndex(i);
				pageFactory.ECommercePage().clickOnProductNameFromHomePagebyIndex(i);
				assertThat(nameOfProduct, Matchers.equalTo(pageFactory.ECommercePage().getProductNameText()));
				pageFactory.ECommercePage().clickOnWeightWatchersLink();

			}
		}

		// check product more than 12
		for (int i = 13; i < productName.size() - 1; i++) {

			if (pageFactory.ECommercePage().getProductNameFromHomePagebyIndex(i).isEmpty()) {

				pageFactory.ECommercePage().clickOnNextLinkOnHomePageTwis();
				String nameOfProduct = pageFactory.ECommercePage().getProductNameFromHomePagebyIndex(i);
				pageFactory.ECommercePage().clickOnProductNameFromHomePagebyIndex(i);
				assertThat(nameOfProduct, Matchers.equalTo(pageFactory.ECommercePage().getProductNameText()));
				pageFactory.ECommercePage().clickOnWeightWatchersLink();
			} else {

				String nameOfProduct = pageFactory.ECommercePage().getProductNameFromHomePagebyIndex(i);
				pageFactory.ECommercePage().clickOnProductNameFromHomePagebyIndex(i);
				assertThat(nameOfProduct, Matchers.equalTo(pageFactory.ECommercePage().getProductNameText()));
				pageFactory.ECommercePage().clickOnWeightWatchersLink();

			}
		}

	}

	@Then("On 'My Account' page - I check product displayed.")
	public void checkProductDisplay() {
		assertThat(pageFactory.ECommercePage().productDisplayed(), Matchers.is(false));
	}

	@When("On 'My Account' page - I check Personal Wish List <Personal_Wish_List> Text.")
	@Then("On 'My Account' page - I check Personal Wish List <Personal_Wish_List> Text.")
	public void checkPersonalWishListText(@Named("Personal_Wish_List") String wishListText) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThat(wishListText.toLowerCase(),
				Matchers.containsString(pageFactory.ECommercePage().personalWishListText().toLowerCase()));
	}

	@Then("On 'My Account' page - I click on Arrow next page")
	public void clickOnNextArrow() {
		pageFactory.ECommercePage().clickOnNextArrowButton();
	}

	@Given("On 'My Account' page - I Delete All Wish Lists <WISH_LIST_DELETE_TEXT>.")
	@Then("On 'My Account' page - I Delete All Wish Lists <WISH_LIST_DELETE_TEXT>.")
	public void deleteAllWishList(@Named("WISH_LIST_DELETE_TEXT") String wishListDelete) {
		pageFactory.ECommercePage().deleteAllWishList(wishListDelete);
	}

	@Then("On 'Product Details' page - click to add all products.")
	public void clickToAddAllProductToWishList() {
		pageFactory.ECommercePage().clickToAddAllProductToWishList();
	}

	@Given("On 'HomePage' page - Navigate to HomePage.")
	@Then("On 'HomePage' page - Navigate to HomePage.")
	@When("On 'HomePage' page - Navigate to HomePage.")
	public void navigateToHomePage() {
		pageFactory.ECommercePage().navigateToHomePage();
	}

	@Then("On 'My Account' page - I click on 'Remove' button.")
	public void clickOnRemoveButton() {
		pageFactory.ECommercePage().clickOnRemoveButton();

	}

	@Then("On 'My Account' page - I check on message $MESSAGE_TEXT on Popup.")
	public void checkOnMessageText(@Named("MESSAGE_TEXT") String textmessage) {
		pageFactory.ECommercePage().checkWishListDeleteSuccessfullyMessege(textmessage);
	}

	@Then("On 'My Account' page - I check the number of products in page.")
	public void checkProductsNumber() {
		int number = pageFactory.ECommercePage().ProductsCount();
		boolean productsize;
		if (number >= 11 && number <= 12) {
			productsize = true;
		} else {
			productsize = false;
		}
		Assert.assertTrue(productsize);
	}

	@Given("On 'HomePage' page - I fill search <SKU> field.")
	@When("On 'HomePage' page - I fill search <SKU> field.")
	@Then("On 'HomePage' page - I fill search <SKU> field.")
	public void fillSKUSearchField(@Named("SKU") String SKU) {
		pageFactory.ECommercePage().fillSearchField(SKU);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("On 'Product Details Page' page - I check for 'SKU Number' <SKU>.")
	@Then("On 'Product Details Page' page - I check for 'SKU Number' <SKU>.")
	@When("On 'Product Details Page' page - I check for 'SKU Number' <SKU>.")
	public void checkForSkuNumber(@Named("SKU") String skuNumber) {
		assertThat(pageFactory.ECommercePage().getProductSkuText(), Matchers.containsString(skuNumber));
	}

	@Given("On 'HomePage' page -  I check On on the Page URL $URLPage.")
	@Then("On 'HomePage' page -  I check On on the Page URL $URLPage.")
	@When("On 'HomePage' page -  I check On on the Page URL $URLPage.")
	public void checkOnPricingURL(@Named("URLPage") String url) {

		String URLSite = pageFactory.ECommercePage().checkOnURL();

		assertThat(URLSite, Matchers.containsString(url));
	}

	@Given("On 'Billing & Shipping Method' page -  I click on 'Edit Address'.")
	@Then("On 'Billing & Shipping Method' page -  I click on 'Edit Address'.")
	public void clickOnEditAddressLink() {
		String shippingAddressSection = pageFactory.ECommercePage().shippingAddressSection().toString();
		StateHelper.setStoryState("OldShippingAddressSection", shippingAddressSection);

		pageFactory.ECommercePage().clickOnEditAddressLink();
	}

	@Given("On 'Billing & Shipping Method' page -  I check Edit Address Text <EDIT_ADDRESS>.")
	@Then("On 'Billing & Shipping Method' page -  I check Edit Address Text <EDIT_ADDRESS>.")
	public void checkEditAddressText(@Named("EDIT_ADDRESS") String editAddress) {
		assertThat(pageFactory.ECommercePage().editAddressPageText().toString(),
				Matchers.equalToIgnoringCase(editAddress));
	}

	@Given("On 'Billing & Shipping Method' page -  I fill Street Address $STREET_ADDRESS.")
	@Then("On 'Billing & Shipping Method' page -  I fill Street Address $STREET_ADDRESS.")
	public void fillStreetAddressFeild(@Named("STREET_ADDRESS") String streetAddress) {

		if (pageFactory.ECommercePage().getElementByCssSelector("streetFeiledInPersonalInformation")
				.getAttribute("value").toString().equals(streetAddress)) {

			pageFactory.ECommercePage().fillStreetAddress("888 7th Ave");

		} else {
			pageFactory.ECommercePage().fillStreetAddress(streetAddress);
		}

	}

	@Given("On 'Billing & Shipping Method' page -  I fill city $CITY.")
	@Then("On 'Billing & Shipping Method' page -  I fill city $CITY.")
	public void fillCityFeild1(@Named("CITY") String city) {

		if (pageFactory.ECommercePage().getElementByCssSelector("cityFeiledInPersonalInformation").getAttribute("value")
				.toString().equals(city)) {

			pageFactory.ECommercePage().fillcity("New York");

		} else {

			pageFactory.ECommercePage().fillcity(city);
		}
	}

	@Given("On 'Billing & Shipping Method' page -  I choose State <STATE>.")
	@Then("On 'Billing & Shipping Method' page -  I choose State <STATE>.")
	public void chooseStateFromDropDownList(@Named("STATE") String state) {
		if (pageFactory.ECommercePage().getStateFeild().getFirstSelectedOption().getText().toString().equals(state)) {

			pageFactory.ECommercePage().selectState("New York");
		} else

			pageFactory.ECommercePage().selectState(state);

	}

	@Given("On 'Billing & Shipping Method' page -  I fill zip code <ZIP_CODE>.")
	@Then("On 'Billing & Shipping Method' page -  I fill zip code <ZIP_CODE>.")
	public void fillZipCodeFeild(@Named("ZIP_CODE") String zipCode) {

		if (pageFactory.ECommercePage().getElementByCssSelector("zipFeild").getAttribute("value").toString()
				.equals(zipCode)) {

			pageFactory.ECommercePage().fillZipCode("10106");
		} else {
			pageFactory.ECommercePage().fillZipCode(zipCode);
		}

	}

	@Given("On 'Billing & Shipping Method' page -  I will Save all Information.")
	@Then("On 'Billing & Shipping Method' page -  I will Save all Information.")
	public void saveAllInformation() {

		InformationBilingAddress storedInforamtion = new InformationBilingAddress();
		storedInforamtion.setFirstName(
				pageFactory.ECommercePage().getElementByCssSelector("firstNameFeild").getAttribute("value").toString());
		storedInforamtion.setLastName(
				pageFactory.ECommercePage().getElementByCssSelector("lastNameFeild").getAttribute("value").toString());
		storedInforamtion.setCity(
				pageFactory.ECommercePage().getElementByCssSelector("cityFeild").getAttribute("value").toString());
		storedInforamtion.setStreet(pageFactory.ECommercePage().getElementByCssSelector("streetAddressFeild")
				.getAttribute("value").toString());
		storedInforamtion
				.setState(pageFactory.ECommercePage().getStateFeild().getFirstSelectedOption().getText().toString());
		storedInforamtion.setZipCode(
				Integer.parseInt(pageFactory.ECommercePage().getZipCodeFeild().getAttribute("value").toString()));

		StateHelper.setStoryState("StoredInforamtion", storedInforamtion);

	}

	@Given("On 'Billing & Shipping Method' page -  I click on submit button.")
	@Then("On 'Billing & Shipping Method' page -  I click on submit button.")
	public void clickOnSubmit() {
		pageFactory.ECommercePage().clickOnSubmit();
	}

	@Given("On 'Billing & Shipping Method' page -  I check on Text of Error Message displayes $ERROR_MESSAGE.")
	@Then("On 'Billing & Shipping Method' page -  I check on Text of Error Message displayes $ERROR_MESSAGE.")
	@When("On 'Billing & Shipping Method' page -  I check on Text of Error Message displayes $ERROR_MESSAGE.")
	public void checkOnErrorMessageText(@Named("ERROR_MESSAGE") String errortext) {
		assertThat(pageFactory.ECommercePage().errorMessageText(), Matchers.equalToIgnoringCase(errortext));
	}

	@Given("On 'Billing & Shipping Method' page - I click on remove link.")
	@When("On 'Billing & Shipping Method' page - I click on remove link.")
	@Then("On 'Billing & Shipping Method' page - I click on remove link.")
	public void clickOnRemoveLinkMethodPage() {

		pageFactory.ECommercePage().clickOnRemoveLink();

	}

	@Given("On 'Billing & Shipping Method' page -  Displayes Error Messages for empty 'Required' field $Error_Messages.")
	@Then("On 'Billing & Shipping Method' page -  Displayes Error Messages for empty 'Required' field $Error_Messages.")
	public void errorMessageOnEmptyEditRequiredField(@Named("Error_Messages") String errortext) {
		assertThat(pageFactory.ECommercePage().errorMessageEmptyFiled().toString(),
				Matchers.equalToIgnoringCase(errortext));

	}
}
