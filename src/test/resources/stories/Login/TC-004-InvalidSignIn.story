Meta:
@production

Scenario: TC-004-Login - Verify Sign in - Invalid Scenario

Given I am on login page
When user login with InValid_User_Name user name and InValid_Password password.
Then The SignInErrorMsg should be Your email or password is incorrect. Please try again.
