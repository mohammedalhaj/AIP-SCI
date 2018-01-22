Meta:
@production
Scenario: TC-022- Physics Today- verify view all jobs page

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] view_All_Jobs should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1011-0100] Page Url should equal to https://jobs.physicstoday.org, Within 20 seconds