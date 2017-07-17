Scenario: TC-013-Home Page - Verify "SIGN UP FOR ALERTS" link (When the user is logged in)
 
Given I am On ScitationPage
When I click on SignIn_Btn
And I Fill mnajjar@aspire-infotech.net to : username
And I Fill Password123! to : password
And I click on Login_button
When The Menu should display
Then The HomePage_SignUpForAlerts should display