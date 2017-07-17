
Scenario: TC-014-JCP-Verify SignUp For Journal Alert without login.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on SignUpForAlerts
Then The LoginInput should display
And The PasswordInput should display