Scenario: TC-014-Publications - Verify the "SIGN UP FOR ALERTS" section when the user is logged in.

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
And I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Advances_Journal_List
And I click on SignUpForAlerts
Then The Alerts_Tab should display