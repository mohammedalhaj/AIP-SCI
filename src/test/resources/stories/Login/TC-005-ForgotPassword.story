Meta:
@production

Scenario: TC-005-Login - Verify the Forgot password?

Given I am On ScitationPage
When I click on SignIn_Btn
And I click on Forgot_Password
Then The ForgotPassword_Dialog_header should be Can't sign in? Forgot your password?
Then The ForgotPassword_Dialog_EmailTextBox should display

