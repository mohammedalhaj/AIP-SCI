Meta:
@production
Scenario: TC-012- Physics Today- verify the function of the SIGN UP FOR ALERTS link

Given [1000-9000] User opens login page
And [1000-3000] User maximize browser window
When [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Signup_Alerts should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1100-1320] User scroll to the journal_Alerts_Page
And [1111-1030] journal_Alerts_Page should be presence, Within 20 seconds
