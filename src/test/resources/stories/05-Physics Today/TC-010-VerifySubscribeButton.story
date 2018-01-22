Meta:
@production
Scenario: TC-010- Physics Today- Verify subscribe button

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Subscribe_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] physics_Today_Subscribe_Page should be displayed, Within 20 seconds
And [1101-0140] Text should contain Thank you for your interest in Physics Today.