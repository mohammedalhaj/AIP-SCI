
Meta:
@production
Scenario: TC-007- Physics Today- Verify Facebook sharing

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1000] Share_FB_PT should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switchs to tab 2
Then [1011-0000] Page Url should contain facebook, Within 20 seconds
