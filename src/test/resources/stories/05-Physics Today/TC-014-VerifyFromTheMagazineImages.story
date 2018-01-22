Meta:
@production
Scenario: TC-014- Physics Today- Verify PhysicsToday From The Magazine imagess

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] magazine_Image1 should be displayed, Within 20 seconds
And [1101-1080] magazine_Image2 should be displayed
And [1101-1080] magazine_Image3 should be displayed
And [1101-1080] magazine_Image4 should be displayed
