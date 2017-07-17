Meta:
@production

Scenario: TC-003-Registration -Verify that validation error appears when one of the fields is empty

Given I am On ScitationPage
When I click on SignIn_Btn
And I click on Register_Btn
And I click on RegisterationPage_Register_Btn
Then The RegisterationPage_ErrorMsg should be Your registration cannot be completed. Missing fields and other types of errors are highlighted in red.
