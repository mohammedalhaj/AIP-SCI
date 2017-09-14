Meta:
@production

Scenario: TC-002-Login - Sign out And user welcome is gone 

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
And I click on Profile_Welcome
And I click on Logout
Then The Profile_Welcome should Not display
