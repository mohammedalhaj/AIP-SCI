Meta:
@production

Scenario: TC-005-Registration -Verify the Cancel button

Given I am On ScitationPage
When I click on SignIn_Btn
And I click on Register_Btn
And I Fill Registration form
And I click on RegisterationPage_Cancel_Btn
Then The Menu should display