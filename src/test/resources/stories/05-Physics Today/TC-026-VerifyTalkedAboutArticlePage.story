Meta:
@production
Scenario: TC-026- Physics Today- verify talked about article page

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] talked_About should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] talked_About_Articles should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] physics_Today_Header should be displayed, Within 20 seconds