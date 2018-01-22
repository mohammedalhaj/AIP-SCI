Meta:
@production
Scenario:TC-019- Physics Today- Verify The First Ad on the right

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] first_Ad_Right should be clickable, Within 20 seconds
And [1100-0300] User click on it