Meta:
@production

Scenario: TC-002-Publishers - Verify the Home page for Publisher  AIP 

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] Menu should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Menu_Publishers should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] aip_Publishers_Logo should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] publishers_Title should be displayed, Within 20 seconds
And [1101-0140] Text should contain AIP Publishing
And [1101-1080] Publishers_Home should be displayed
And [1101-1080] Publishers_Browse should be displayed
And [1101-1080] signUpForAlerts should be displayed
And [1101-1080] publishers_Publications should be displayed
And [1101-0140] Text should contain Publications
And [1101-1080] publicationCoverImage should be displayed
And [1101-1080] publishers_Featured should be displayed
And [1101-0140] Text should contain Featured
And [1000-9140] Close the browser