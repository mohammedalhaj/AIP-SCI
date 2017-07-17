
Scenario: TC-014-JAP-Verify SignUp For Journal Alert without login.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on SignUpForAlerts
Then The LoginInput should display
And The PasswordInput should display