Meta:
@production

Scenario: TC-001-Registration -Verify the Registration page

Given I am On ScitationPage
When I click on SignIn_Btn
And I click on Register_Btn
Then The RegisterationPage_Headline should be Register
