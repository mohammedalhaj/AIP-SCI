Meta:
@production

Scenario: TC-001-Profile -Verify the existence of PROFILE.

Given I am On ScitationPage
When I click on SignIn_Btn
And I Fill mnajjar@aspire-infotech.net to : username
And I Fill Password123! to : password
And I click on Login_button
And The Profile_Welcome should be Mohammed Najjar
And I click on Profile_Welcome
Then The Profile should display




