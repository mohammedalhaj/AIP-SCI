Meta:
@production

Scenario: TC-005-01-Registration -Verify password validation

Given I am On ScitationPage
When I click on SignIn_Btn
And I click on Register_Btn
And I Fill asdf to : Registeration_Password_TextBox
Then The Password_TooShort should display


Scenario: TC-005-02-Registration -Verify password validation

Given I am on RegistrationPage
When I Fill asdfasdf to : Registeration_Password_TextBox
Then The Password_Weak should display


Scenario: TC-005-03-Registration -Verify password validation

Given I am on RegistrationPage
When I Fill asdfasdf12@3 to : Registeration_Password_TextBox
Then The Password_Medium should display


Scenario: TC-005-04-Registration -Verify password validation

Given I am on RegistrationPage
When I Fill =o)711Y::64&7tI to : Registeration_Password_TextBox
Then The Password_Strong should display