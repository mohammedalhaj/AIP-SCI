Meta:
@production
Scenario: TC-028- Physics Today- Verify Subscribe Banner

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] banner_Subscribe should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] left_Title should be displayed, Within 20 seconds
And [1101-0140] Text should contain Login Required