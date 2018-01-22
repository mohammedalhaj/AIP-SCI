Meta:
@production
Scenario: TC-011- Physics Today- Verify Physics Tody tabs

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Physics_Today_Home should be displayed, Within 20 seconds
And [1101-0140] Text should contain HOME
And [1101-1080] physics_Today_Browse should be displayed
And [1101-0140] Text should contain BROWSE
And [1101-1080] physics_Today_Info should be displayed
And [1101-0140] Text should contain INFO
And [1101-1080] physics_Today_Jobs should be displayed
And [1101-0140] Text should contain JOBS
