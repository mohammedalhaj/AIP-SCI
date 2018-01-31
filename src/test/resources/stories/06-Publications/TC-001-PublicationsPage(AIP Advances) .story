Meta:
@production

Scenario: TC-001-Publications  - Verify the publications page (AIP Advances)

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] Menu should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Menu_Publishers should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] aip_Publishers_Logo should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Publishers_Title should be displayed, Within 20 seconds
And [1101-0140] Text should contain AIP Publishing
And [1111-1000] Aip_Advances should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switches to tab 1
And [1111-1080] Publishers_Logo should be displayed, Within 20 seconds
And [1101-1080] Publishers_Title should be displayed
And [1101-0140] Text should contain AIP Advances
And [1101-1080] Publishers_Home should be displayed
And [1101-1080] Publications_Browse should be displayed
And [1101-1080] Info should be displayed
And [1101-1080] ForAuthors should be displayed
And [1101-1080] SignUpForAlerts should be displayed
And [1000-9140] Close the browser