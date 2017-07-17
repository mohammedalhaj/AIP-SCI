Meta:
@production

Scenario: TC-004-Registration -Verify the invalid Captcha in registration page.

Given I am On ScitationPage
When I click on SignIn_Btn
And I click on Register_Btn
And I Fill Registration form
And I click on RegisterationPage_Register_Btn
Then The Captcha_invalid_Msg should be Captcha is invalid 