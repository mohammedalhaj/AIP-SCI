Meta:
@production
Scenario: TC-027- Physics Today- verify the footer

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Resources should be displayed, Within 20 seconds
And [1101-1080] author_Main should be displayed
And [1101-1080] advertiser_Main should be displayed
And [1101-1080] about_Main should be displayed
And [1101-1080] contact_Main should be displayed
And [1101-1080] help_Main should be displayed
And [1101-1080] privacy_Policy_Main should be displayed
And [1101-1080] terms_Of_Use_Main should be displayed
And [1101-1080] follow_Aip_Publishing_Main should be displayed
And [1101-1080] Facebook_Icon should be displayed
And [1101-1080] Twitter_Icon should be displayed
And [1101-1080] Linkedin_Icon should be displayed

