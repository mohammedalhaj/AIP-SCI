
Scenario: TC-014-ADV-Verify SignUp For Journal Alert without login.
 
Given I am On ScitationPage
When I scroll To JournalAdvance
And I click on JournalAdvance
And I click on SignUpForAlerts
Then The LoginInput should display
And The PasswordInput should display