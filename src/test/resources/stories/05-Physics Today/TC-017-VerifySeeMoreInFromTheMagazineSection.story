Meta:
@production
Scenario: TC-017- Physics Today- verify see more in From The Magazine section

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] magazine_See_More should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] latest_Issues_Page should be displayed, Within 20 seconds
And [1101-0140] Text should contain Table of Contents
