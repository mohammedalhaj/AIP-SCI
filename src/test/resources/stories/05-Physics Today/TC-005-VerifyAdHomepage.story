Meta:
@production
Scenario:TC-005- Physics Today- Verify The Ad Homepage

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1000] ad should be clickable, Within 20 seconds
And [1100-0300] User click on it