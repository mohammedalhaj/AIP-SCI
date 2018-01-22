Meta:
@production
Scenario: TC-012- Physics Today- verify the function of the SIGN UP FOR ALERTS link

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Signup_Alerts should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] journal_Alerts_Page should be displayed, Within 20 seconds
