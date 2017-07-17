
Scenario: TC-014-APL-Verify SignUp For Journal Alert without login.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on SignUpForAlerts
Then The LoginInput should display
And The PasswordInput should display