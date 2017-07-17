Meta:
@production

Scenario: TC-002-Registration -Verify the existence of registration page sections

Given I am On ScitationPage
When I click on SignIn_Btn
And I click on Register_Btn
Then The RegisterationPage_Headline should be Register
And The Registeration_FirstName_TextBox should display
And The Registeration_LasttName_TextBox should display
And The Registeration_Email_TextBox should display
And The Registeration_Password_TextBox should display
!-- And The Registeration_OffersByEmail_Checkbox should display
And The RegisterationPage_Register_Btn should display
And The RegisterationPage_Cancel_Btn should display