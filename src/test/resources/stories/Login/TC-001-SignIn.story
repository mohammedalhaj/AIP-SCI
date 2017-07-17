Meta:
@production

Scenario: TC-001-Login - Sign in with a valid login/password And user welcome comes up

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
Then The Profile_Welcome should be Mohammed Najjar
