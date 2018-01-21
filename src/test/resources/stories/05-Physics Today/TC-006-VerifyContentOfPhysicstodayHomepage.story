Meta:
@production
Scenario: TC-006- Physics Today- verify the function of �Physicstoday title link

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1000] Physics_Today_Header should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] ad should be displayed, Within 20 seconds
And [1101-1080] share_Section should be displayed
And [1101-1080] SignUpForAlerts should be displayed
And [1101-1080] subscribe should be displayed
And [1101-1080] Journal_Tabs should be displayed