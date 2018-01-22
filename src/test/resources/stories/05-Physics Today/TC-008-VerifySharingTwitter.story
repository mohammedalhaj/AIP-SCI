Meta:
@production
Scenario: TC-008- Physics Today- Verify Twitter sharing

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Physics_Today_Image should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1000] share_Twitter_Pt should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switchs to tab 2
Then [1011-0100] Page Url should equal to https://twitter.com/physicstoday, Within 20 seconds