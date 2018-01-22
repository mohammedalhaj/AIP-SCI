Meta:
@production
Scenario: TC-013- Physics Today- Verify PhysicsToday Most Recent Online Stories images

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] most_Recent_Image1 should be displayed, Within 20 seconds
And [1101-1080] most_Recent_Image2 should be displayed
And [1101-1080] most_Recent_Image3 should be displayed
And [1101-1080] most_Recent_Image4 should be displayed
And [1101-1080] most_Recent_Image5 should be displayed
And [1101-1080] most_Recent_Image6 should be displayed