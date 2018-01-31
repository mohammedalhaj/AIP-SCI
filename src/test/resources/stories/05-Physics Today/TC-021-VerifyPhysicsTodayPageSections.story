Meta:
@production
Scenario: TC-021- Physics Today-Verify Physic Today Page Sections

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] aip_Publisher should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] physics_Today_Journal should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] physics_Today_Home_Title should be displayed, Within 20 seconds
And [1101-1080] published_Date should be displayed
And [1101-1080] most_Recent_Online_Stories should be displayed
And [1101-0140] Text should contain MOST RECENT ONLINE STORIES
And [1101-1080] most_Read should be displayed
And [1101-0140] Text should contain Most Read
And [1101-1080] latest_Physics_Jobs should be displayed
And [1101-0140] Text should contain LATEST PHYSICS JOBS
And [1101-1080] latest_Magazine_Issues should be displayed
And [1101-0140] Text should contain LATEST MAGAZINE ISSUES
