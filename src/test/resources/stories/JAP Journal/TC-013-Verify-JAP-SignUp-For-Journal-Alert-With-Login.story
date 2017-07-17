
Scenario: TC-013-JAP-Verify SignUp For Journal Alert With login.
 
Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
And I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on SignUpForAlerts
Then The AlertLabelOnPage should display