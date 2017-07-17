package aspire.com.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.By.cssSelector;
import static org.seleniumhq.selenium.fluent.Period.secs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.selenium.fluent.FluentSelect;
import org.seleniumhq.selenium.fluent.FluentWebElement;

import com.google.common.base.Function;

import aspire.com.steps.Selectors;
import aspire.com.util.EnvironmentVariables;
import jo.aspire.automation.logger.EnvirommentManager;

/**
 * Page object defining the home page
 */
public class ECommercePage extends GenericPage {
	public ECommercePage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	WebDriverWait wait;
	private final int CONST_WAIT_UPPER_VALUE = 60;
	private final int CONST_WAIT_LOWER_VALUE = 30;

	public String errorMessageEmptyFiled() {
		return getElementByCssSelector("errorAlertEmpty").getText().toString();
	}

	public void clickOnRemoveLink() {
		getElementByCssSelector("removeLinkMethodPage").click();
	}

	public void clickOnSubmit() {
		getElementByCssSelector("submitButton3").click();
	}

	public void selectState(String state) {
		By stateDropDownList1 = cssSelector(Selectors.getProperty("stateDropDownList1"));
		select(stateDropDownList1).selectByVisibleText(state);
	}

	public void fillcity(String city) {
		getElementByCssSelector("cityFeild").clear();
		getElementByCssSelector("cityFeild").sendKeys(city);

	}

	public void fillStreetAddress(String streetAddress) {
		getElementByCssSelector("streetAddressFeild").clear();
		getElementByCssSelector("streetAddressFeild").sendKeys(streetAddress);

	}

	public String editAddressPageText() {
		return getElementByCssSelector("editAddressText").getText().toString();
	}

	public void clickOnEditAddressLink() {
		getElementByCssSelector("shippingAddressSection").click();
	}

	public String shippingAddressSection() {
		return getElementByCssSelector("shippingAddressSection").getText().toString();
	}

	public String checkOnURL() {

		return getCurrentUrl();
	}

	public String getProductSkuText() {
		return getElementByCssSelector("productSkuText").getText().toString().substring(4);
	}

	public Integer ProductsCount() {
		int numberOfProduct = getElementsByCssSelector("productDisplay").size();
		return numberOfProduct;

	}

	public Boolean productDisplayed() {
		sleepTime(2000);
		getElementByCssSelector("productDisplay").isDisplayed();
		return false;
	}

	public int retrunWishList() {
		sleepTime(2000);
		return getElementsByCssSelector("wishListDeleteSuccessfullyMessege").size();
	}

	public void waitingForYesElementsDisplyed(final int numItem) {
		boolean result;
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(getDriverProvider().get())
				.withTimeout(60, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		result = wait.until(new Function<WebDriver, Boolean>() {

			public Boolean apply(WebDriver driver) {

				if (getElementByCssSelector("deletePopUp").isDisplayed()) {
					return true;
				}
				return false;
			}
		});
		assertThat(result, Matchers.is(true));
	}

	public void clickOnYesButton() {

		waitingForYesElementsDisplyed(3000);
		getElementByCssSelector("yesButtonDeleteWishList").click();

	}

	public void checkWishListDeleteSuccessfullyMessege(String wishList) {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector(Selectors.getProperty("wishListDeleteSuccessfullyMessege"))));

		assertThat(getElementByCssSelector("wishListDeleteSuccessfullyMessege").getText().toString(),
				Matchers.equalToIgnoringCase(wishList));
	}

	public void selectWishListDropDownList(int i) {
		String nextItemInWishList = getElementsByCssSelector("deleteWishListLink").get(i).getText().toString();
		By wishListDropDownList = cssSelector(".drop_down_language_select");
		select(wishListDropDownList).selectByVisibleText(nextItemInWishList);
		getElementByCssSelector("wishListDropDownList");

	}

	public void clickOnButtonNumberTow() {
		getElementByCssSelector("buttonNumberTow").click();
		sleepTime(2000);
	}

	public void navigateToHomePage() {
		String URL = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_URL");
		get(URL);
	}

	public void clickOnRemoveButton() {
		getElementByCssSelector("removebutton").click();

	}

	public void clickOnNextArrowButton() {
		getElementByCssSelector("nextArrowButton").click();
	}

	public void clickToAddAllProductToWishList() {

		List<WebElement> element = getElementsByCssSelector("productsName");
		for (int i = 0; i < element.size(); i++) {
			element.get(i).click();
			clickOnAddToWishList();
			clickOnCategoryItem("All Products");
			element = getElementsByCssSelector("productsName");
		}

		// move to getteing started category
		clickOnCategoryItem("All Products");
		clickOnButtonNumberTow();
		element = getElementsByCssSelector("productsName");
		for (int i = 0; i < 4; i++) {
			element.get(i).click();
			clickOnAddToWishList();
			clickOnCategoryItem("All Products");
			clickOnButtonNumberTow();
			element = getElementsByCssSelector("productsName");
		}
	}

	public void clickOnWishListItem() {
		String wishListItem = getElementsByCssSelector("deleteWishListLink").get(0).getText().toString();
		if (wishListItem.equals("Wish List")) {
			selectWishListDropDownList(1);

		} else {
			selectWishListDropDownList(0);
		}
	}

	public void clickOnDeleteWishList(String wishList) {
		clickOnWishListItem();
		getElementByCssSelector("deleteWishListLink").click();
		clickOnYesButton();
		checkWishListDeleteSuccessfullyMessege(wishList);
		clickOnContinueShoppingLink();
	}

	public void deleteAllWishList(String wishList) {
		while (retrunWishList() != 1) {
			clickOnDeleteWishList(wishList);
		}
	}

	public void clickOnNextLinkOnHomePageTwis() {
		getElementsByCssSelector("nextLinkOnHomePage").get(1).click();
		// System.err.println("click on arrow 1 ");
		getElementsByCssSelector("nextLinkOnHomePage").get(2).click();
		// System.err.println("click on arrow 2 ");
		getElementsByCssSelector("nextLinkOnHomePage").get(1).click();
		// System.err.println("click on arrow 3 ");
		sleepTime(2000);
	}

	public String personalWishListText() {
		return getElementByCssSelector("personalWishListText").getText().toString();
	}

	public void clickOnProductNameFromHomePagebyIndex(int index) {
		getElementsByCssSelector("homePageProduct").get(index).click();
	}

	public void clickOnNextLinkOnHomePage() {
		getElementsByCssSelector("nextLinkOnHomePage").get(1).click();
		// System.err.println("click on arrow 1 ");
		getElementsByCssSelector("nextLinkOnHomePage").get(2).click();
		// System.err.println("click on arrow 2 ");
		sleepTime(3000);
	}

	public String getProductNameFromHomePagebyIndex(int index) {
		String name = getElementsByCssSelector("homePageProduct").get(index).getText().toString();
		// System.err.println("productname: "+ name);
		return name;
	}

	public void clickOnWeightWatchersLink() {
		getElementByCssSelector("weightWatchersLogoLink").click();
	}

	public String getRegistrationErrorMessagesText() {
		return getElementByCssSelector("registrationErrorMessage").getText().toString();
	}

	public String orderNumberText() {
		return getElementByCssSelector("orderNumber").getText().toString();
	}

	public String[] getAllShippingInformationData() {

		String allInformation = getElementByCssSelector("shippingAddressDisplayArea").getText().toString();
		allInformation.split("\n");

		String allInfoArray[] = allInformation.split("\n");
		return allInfoArray;
	}

	public String checkThankYouForYourOrderText() {
		return getElementByCssSelector("thankYouForYourOrder").getText().toString();
	}

	public void submitButton() {
		getElementByCssSelector("submitButton1").click();
	}

	public void clickOnShippingAndBillingAddress() {
		getElementByCssSelector("submitButton3").click();

	}

	public void fillNewZipCode(String zipCode) {
		getElementByCssSelector("zipFeild").clear();
		getElementByCssSelector("zipFeild").sendKeys(zipCode);
	}

	public void fillNewPhoneNumber(String phoneNumber) {

		getElementByCssSelector("newPhoneNumber").clear();
		getElementByCssSelector("newPhoneNumber").sendKeys(phoneNumber);
	}

	public void fillNewEmail(String email) {
		getElementByCssSelector("emailFeild1").clear();
		getElementByCssSelector("emailFeild1").sendKeys(email);
	}

	public void fillState(String state) {
		getElementByCssSelector("stateDropDownList1").clear();
		getElementByCssSelector("stateDropDownList1").sendKeys(state);
	}

	public void selectNewState(String state) {
		By stateDropDownList1 = cssSelector("#state");
		select(stateDropDownList1).selectByVisibleText(state);
	}

	public void selectNewItemFromCountryDropDownList(String country) {
		By newCountryDropDownList = cssSelector("#country");
		select(newCountryDropDownList).selectByVisibleText(country);
	}

	public void fillNewCityField(String city) {
		getElementByCssSelector("cityFeild").clear();
		getElementByCssSelector("cityFeild").sendKeys(city);
	}

	public void fillNewFirstStreetAdress(String fisrtAddress) {
		getElementByCssSelector("streetAddressFeild").clear();
		getElementByCssSelector("streetAddressFeild").sendKeys(fisrtAddress);
	}

	public void fillNewSecondAddress(String address) {
		getElementByCssSelector("newSecondStreetAddress").clear();
		getElementByCssSelector("newSecondStreetAddress").sendKeys(address);
	}

	public void fillNewFirstName(String newFisrtName) {
		getElementByCssSelector("firstNameFeild").clear();
		getElementByCssSelector("firstNameFeild").sendKeys(newFisrtName);
	}

	public void fillNewLastName(String newLastName) {
		getElementByCssSelector("lastNameFeild").clear();
		getElementByCssSelector("lastNameFeild").sendKeys(newLastName);
	}

	public void fillNewRecipient(String newRecipientName) {

		if (newRecipientName.length() <= 20) {
			getElementByCssSelector("newRecpientField").clear();
			getElementByCssSelector("newRecpientField").sendKeys(newRecipientName);
		} else {
			String newuser = newRecipientName.substring(0, 20);
			getElementByCssSelector("newRecpientField").clear();
			getElementByCssSelector("newRecpientField").sendKeys(newuser);
		}

	}

	public String createAdressText() {
		return getElementByCssSelector("createAdressText").getText().toString();
	}

	public void createNewShippingAddressLink() {
		getElementByCssSelector("createNewShippingAdressLink").click();

	}

	public String getAlertEmptyFieldText() {
		System.err.println(getElementByCssSelector("alertEmptyField").getText().toString());
		return getElementByCssSelector("alertEmptyField").getText().toString();
	}

	public void clickOnSubmitButton() {
		getElementByCssSelector("submitButton").click();
	}

	public void clickOnDayFromDropDownList() {
		getElementByCssSelector("dayList").click();

	}

	public void clickOnMonthFromDropDownList() {
		getElementByCssSelector("monthList").click();

	}

	public void clickOnYearFromDropDownList() {
		getElementByCssSelector("yearList").click();

	}

	public void clickOnGenderList() {
		getElementByCssSelector("genderList").click();

	}

	public void fillPhoneNumberField(String phoenNumber) {
		getElementByCssSelector("phoneNumberField").clear();
		getElementByCssSelector("phoneNumberField").sendKeys(phoenNumber);
	}

	public void fillEmail(String email) {
		getElementByCssSelector("emailField").clear();
		getElementByCssSelector("emailField").sendKeys(email);
	}

	public void fillZipCode(String zip_code) {
		getElementByCssSelector("zipCodeFeild").clear();
		getElementByCssSelector("zipCodeFeild").sendKeys(zip_code);
	}

	public void clickOnStateFromDropDownList() {
		getElementByCssSelector("stateListItems").click();

	}

	public void fillCityField1(String city) {
		getElementByCssSelector("cityField1").clear();
		getElementByCssSelector("cityField1").sendKeys(city);
	}

	public void fillFirstStreetAddressFeild(String streetAddress) {
		getElementByCssSelector("firstStreetAddressField").clear();
		getElementByCssSelector("firstStreetAddressField").sendKeys(streetAddress);
	}

	public void fillFirstName(String first_name) {
		getElementByCssSelector("firstNnameField").clear();
		getElementByCssSelector("firstNnameField").sendKeys(first_name);
	}

	public void fillLastName(String last_name) {

		getElementByCssSelector("lastNnameField").clear();
		getElementByCssSelector("lastNnameField").sendKeys(last_name);
	}

	public void fillConfirmPassword(String password) {
		getElementByCssSelector("confirmPasswordFeild").clear();
		getElementByCssSelector("confirmPasswordFeild").sendKeys(password);
	}

	public void fillPassword(String password) {
		getElementByCssSelector("passwordFeild").clear();
		getElementByCssSelector("passwordFeild").sendKeys(password);
	}

	public void fillUsernameField(String userName) {
		getElementByCssSelector("userNameField1").clear();
		getElementByCssSelector("userNameField1").sendKeys(userName);
	}

	public String checkRegisterUserText() {

		return getElementByCssSelector("registerText").getText().toString();

	}

	public void clickOnRegisterButton() {
		getElementByCssSelector("homePageRegisterLink").click();
	}

	public void clickOnRemove() {
		getElementByCssSelector("removeLink").click();
	}

	public String getAddToWishListText() {

		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Selectors.getElement("addToWishListText")));

		return getElementByCssSelector("addToWishListText").getText().toString();
	}

	public void clickOnAddToWishList() {
		getElementByCssSelector("addToWishListButton").click();
	}

	public void clickOnContinueShoppingLink() {
		getElementByCssSelector("continueShoppingButton").click();
	}

	public void clickOnContinueShoppingButton() {
		getElementByCssSelector("continueShoppingButton").click();
	}

	public void removeAllProductsFromWishList() {
		while (!(getElementByCssSelector("wishListProducts").getText().toString().equalsIgnoreCase(
				"Your wish list is empty. If you see something you would like to add to your wish list when shopping, click Add to wish list."))) {
			getElementByCssSelector("reomveProductLink").click();
			sleepTime(2000);
			clickOnContinueShoppingButton();
		}

	}

	public void clickOnPersonalWishList() {
		getElementByCssSelector("personalWishListLink").click();

	}

	public String checkMyAccountText() {
		return getElementByCssSelector("checkMyAccountText").getText().toString();
	}

	public void clickOnLoginButton() {
		getElementByCssSelector("loginButton").click();
	}

	public String getCategoryNameText() {
		return getElementByCssSelector("categoryNameText").getText().toString();
	}

	public void clickOnCategoryItem(String item) {

		List<WebElement> items = getElementsByCssSelector("categoryItems");
		for (int i = 0; i < items.size(); i++) {

			WebElement link = items.get(i);
			String text = items.get(i).getText().toString();
			if (text.contains(item)) {
				link.click();
				break;
			}
		}

	}

	public void clickSubmitButtonOrderSummary() {
		getElementByCssSelector("submitButton").click();
	}

	public String getOrderSummaryText() {
		return getElementByCssSelector("errorMessageText").getText().toString().trim();

	}

	public String errorMessageText() {

		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Selectors.getElement("errorMessageText")));

		return getElementByCssSelector("nextButtonMethodPage").getText().toString();
	}

	public void clickNextButtonMethodPage() {
		getElementByCssSelector("nextButtonMethodPage").click();
		sleepTime(3000);

	}

	public void fillCCCardNumberField(String cc_cardNumber) {
		getElementByCssSelector("cardNumberFieldCVV").clear();
		getElementByCssSelector("cardNumberFieldCVV").sendKeys(cc_cardNumber);
	}

	public void selectItemFromBillingMethod(String creditCardName) {

		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Selectors.getElement("billingMethodList")));
		By billingMethodList = Selectors.getElement("billingMethodList");
		select(billingMethodList).selectByVisibleText(creditCardName);
		sleepTime(3000);
	}

	public void fillCardNumberField(String cardNumber) {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Selectors.getElement("cardNumberField")));

		getElementByCssSelector("cardNumberFieldCVV").clear();
		getElementByCssSelector("cardNumberFieldCVV").sendKeys(cardNumber);

	}

	public void selectInvalidMonth(String invalidMonth) {
		By dropMonth = Selectors.getElement("dropMonth");
		select(dropMonth).selectByValue(invalidMonth);

	}

	public void fillLocationField(String location) {
		getElementByCssSelector("locationField").clear();
		getElementByCssSelector("locationField").sendKeys(location);
	}

	public void clickOnAgreementCheckbox() {
		getElementByCssSelector("agreementCheckbox").click();
	}

	public void clickOnPostReviewButton() {
		getElementByCssSelector("postReviewButton").click();
	}

	public String getReviewSubmittedText() {
		return getElementByCssSelector("reviewSubmittedText").getText().toString();
	}

	public void fillEmailField(String email) {
		getElementByCssSelector("emailField").clear();
		getElementByCssSelector("emailField").sendKeys(email);
	}

	public void fillNickNameField(String nickname) {
		getElementByCssSelector("nickNameField").clear();
		getElementByCssSelector("nickNameField").sendKeys(nickname);
	}

	public void fillReviewField(String review) {
		getElementByCssSelector("reviewField").clear();
		getElementByCssSelector("reviewField").sendKeys(review);
	}

	public void fillReviewTitleField(String reviewTitle) {
		getElementByCssSelector("reviewTitleField").clear();
		getElementByCssSelector("reviewTitleField").sendKeys(reviewTitle);
	}

	public void fillOverAllRating() {
		getElementByCssSelector("overAllRatingRadioButton").click();
	}

	public String getWriteReviewPopUpText() {
		return getElementByCssSelector("writeReviewTextPopUp").getText().toString();
	}

	public void navigateToLoginPage() {
		String URL = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_URL");
		get(URL);
		getDriverProvider().get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		boolean typeDimension = Boolean.parseBoolean(EnvirommentManager.getInstance().getProperty("dimension"));
		// System.err.println("typeDimension: "+typeDimension);
		if (typeDimension) {
			Dimension dimension = new Dimension(1920, 1080);
			getDriverProvider().get().manage().window().setSize(dimension);
		} else {
			getDriverProvider().get().manage().window().maximize();
		}
	}

	public void clickOnBottomWriteReviewButton() {
		getElementByCssSelector("bottomWriteReviewButton").click();
	}

	public void fillEmailFieldShipping(String emailShipping) {
		getElementByCssSelector("emailFieldShipping").clear();
		getElementByCssSelector("emailFieldShipping").sendKeys(emailShipping);
	}

	public void fillPhoneFieldShipping(String phoneNumberShipping) {
		getElementByCssSelector("phoneFieldShipping").clear();
		getElementByCssSelector("phoneFieldShipping").sendKeys(phoneNumberShipping);
	}

	public void clickOnGoToCart() {
		getElementByCssSelector("goToCartButton").click();
	}

	public String getShoppingCartText() {
		return getElementByCssSelector("shoppingCartText").getText().toString();
	}

	public void clickOnContinueCheckout() {
		getElementByCssSelector("continueCheckoutButton").click();
	}

	public void clickOnContinueCheckoutLogInUser() {
		sleepTime(3000);
		getElementByCssSelector("continueCheckoutButtonLogInUser").click();
	}

	public String getbillingAndShippingAddresText() {
		return getElementByCssSelector("billingAndShippingAddresText").getText().toString();
	}

	public void FillRecipientField(String recipientName) {
		getElementByCssSelector("recpientField").clear();
		getElementByCssSelector("recpientField").sendKeys(recipientName);
	}

	public void fillFirstNameField(String firstName) {
		getElementByCssSelector("firstNameField").clear();
		getElementByCssSelector("firstNameField").sendKeys(firstName);
	}

	public void fillLastNameField(String lastName) {
		getElementByCssSelector("lastNameField").clear();
		getElementByCssSelector("lastNameField").sendKeys(lastName);
	}

	public void fillFirstStreetField(String firstStreetAddress) {
		getElementByCssSelector("firstStreetField").clear();
		getElementByCssSelector("firstStreetField").sendKeys(firstStreetAddress);
	}

	public void fillSecondStreetField(String secondStreetAddress) {
		getElementByCssSelector("secondStreetField").clear();
		getElementByCssSelector("secondStreetField").sendKeys(secondStreetAddress);
	}

	public void fillCityField(String city) {
		getElementByCssSelector("cityFieldShipping").clear();
		getElementByCssSelector("cityFieldShipping").sendKeys(city);
	}

	public void selectItemFromDropDownList(String state) {
		By stateDropDownList = Selectors.getElement("stateDropDownList");
		select(stateDropDownList).selectByVisibleText(state);
	}

	public void selectItemFromCountryDropDownList(String country) {
		By countryDropDownList = Selectors.getElement("countryDropDownList");
		select(countryDropDownList).selectByVisibleText(country);
	}

	public void fiLLZipCodeField(String zipCode) {
		getElementByCssSelector("zipCodeFeildShipping").clear();
		getElementByCssSelector("zipCodeFeildShipping").sendKeys(zipCode);
	}

	public void fiLLZipCodeField1(String zipCode) {
		getElementByCssSelector("zipFeild").clear();
		getElementByCssSelector("zipFeild").sendKeys(zipCode);
	}

	public void fillPhoneField(String phoneNumber) {
		getElementByCssSelector("phoneFieldShipping").clear();
		getElementByCssSelector("phoneFieldShipping").sendKeys(phoneNumber);
	}

	public void fillGuestEmailField(String email) {
		getElementByCssSelector("emailFeild").clear();
		getElementByCssSelector("emailFeild").sendKeys(email);
	}

	public void clickSameAddressCheckBox() {
		getElementByCssSelector("sameAddressCheckBox").click();
	}

	public void clickNextButton() {
		getElementByCssSelector("nextButton").click();
	}

	public String ShippingInformation() {
		return getElementByCssSelector("shippingAddressDisplayArea").getText().toString();
	}

	public String getAllDataText() {

		String allInformation = getElementByCssSelector("shippingAddressDisplayArea").getText().toString();
		return allInformation;

	}

	public String[] getAllData() {
		String allInformation = getElementByCssSelector("shippingAddressDisplayArea").getText().toString();
		allInformation.split("\n");

		String allInfoArray[] = allInformation.split("\n");
		return allInfoArray;
	}

	public String getProductNameText() {
		return getElementByCssSelector("productName").getText().toString();
	}

	public void clickOnAddToCart() {
		getElementByCssSelector("addToCartButton1").click();
	}

	public void fillSearchField(String sku) {
		getElementByCssSelector("searchField").clear();
		getElementByCssSelector("searchField").sendKeys(sku);
		getElementByCssSelector("searchField").sendKeys(Keys.ENTER);
	}

	public String getMiniCartTotalText() {
		return getElementByCssSelector("miniCartTotalText").getText().toString();
	}

	public String addToCartButtonText() {
		return getElementByCssSelector("addToCartButton").getText().toString();
	}

	public FluentSelect getStateFeild() {
		By stateDropDownList = Selectors.getElement("stateDropDownList");
		return within(secs(CONST_WAIT_LOWER_VALUE)).select(stateDropDownList);
	}

	public FluentWebElement getZipCodeFeild() {
		By zipFeild = Selectors.getElement("stateDropDownList");
		return within(secs(CONST_WAIT_LOWER_VALUE)).input(zipFeild);
	}

	public String addToCartButtonText1() {
		return getElementByCssSelector("addToCartButton1").getText().toString();
	}

	public void fillQtyField(String quantity) {
		getElementByCssSelector("pdpQuntityField").clear();
		getElementByCssSelector("pdpQuntityField").sendKeys(quantity);
		getElementByCssSelector("pdpQuntityField").sendKeys(Keys.ENTER);
	}

	public void fillStateInputFeild(String state) {

		getElementByCssSelector("stateInputFeild").clear();
		getElementByCssSelector("stateInputFeild").sendKeys(state);

	}

	public void clickOnManageYourAccountFooterLink() {
		getElementByCssSelector("manageYourAccountLink").click();
	}

	public void clickOnManageYourAccountFooterLinkMobile() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriverProvider().get();
		jse.executeScript("arguments[0].click();", getElementByCssSelector("manageYourAccountLink"));
	}

	public void fillUserNameField(String userName) {
		System.err.println("user name :  " + userName);
		getElementByCssSelector("userNameField").clear();
		getElementByCssSelector("userNameField").sendKeys(userName);
	}

	public void fillPasswordField(String password) {
		getElementByCssSelector("passwordField").clear();
		getElementByCssSelector("passwordField").sendKeys(password);
	}

	public void logInButton() {
		getElementByCssSelector("logInButton").click();
	}

	public void clickOnMyAccountLink() {

		getElementByCssSelector("myAccountLink").click();
	}

	public boolean myAccountLinkText() {

		getElementByCssSelector("myAccountLink").isDisplayed();
		return true;
	}

	public String getAlartErrorMessageText() {
		System.err.println(getElementByCssSelector("alartMessage").getText().toString());
		return getElementByCssSelector("alartMessage").getText().toString().trim();
	}

	public void fillFirstNameFieldShipping(String firstNameShipping) {
		getElementByCssSelector("firstNameFieldShipping").clear();
		getElementByCssSelector("firstNameFieldShipping").sendKeys(firstNameShipping);
	}

	public void fillLastNameFieldShipping(String lastNameShipping) {
		getElementByCssSelector("lastNameFieldShipping").clear();
		getElementByCssSelector("lastNameFieldShipping").sendKeys(lastNameShipping);
	}

	public void fillFirstStreetFieldShipping(String firstStreetAddressShipping) {
		getElementByCssSelector("firstNameFieldShipping").clear();
		getElementByCssSelector("firstNameFieldShipping").sendKeys(firstStreetAddressShipping);
	}

	public void fillSecondStreetFieldShipping(String secondStreetAddressShipping) {
		getElementByCssSelector("secondStreetFieldShipping").clear();
		getElementByCssSelector("secondStreetFieldShipping").sendKeys(secondStreetAddressShipping);
	}

	public void fillCityFieldShipping(String cityShipping) {
		getElementByCssSelector("cityFieldShipping").clear();
		getElementByCssSelector("cityFieldShipping").sendKeys(cityShipping);
	}

	public void selectItemFromDropDownListShipping(String stateShipping) {
		By stateDropDownListShipping = Selectors.getElement("stateDropDownListShipping");
		select(stateDropDownListShipping).selectByVisibleText(stateShipping);
	}

	public void selectItemFromCountryDropDownListShipping(String countryShipping) {
		By countryDropDownListShipping = Selectors.getElement("countryDropDownListShipping");
		select(countryDropDownListShipping).selectByVisibleText(countryShipping);
	}

	public void fiLLZipCodeFieldShipping(String zipCodeShipping) {
		getElementByCssSelector("zipCodeFeildShipping").clear();
		getElementByCssSelector("zipCodeFeildShipping").sendKeys(zipCodeShipping);
	}

}
