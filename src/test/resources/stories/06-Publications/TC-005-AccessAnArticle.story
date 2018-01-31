Meta:
@production
Scenario: TC-005-Publications  - A user navigating to a Journal home, then Browse TOC, find an article and access the various tools on the page

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] Menu should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] menu_Publishers should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] aip_Publishers_Logo should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1130] publishers_Title text should contain AIP Publishing, Within 20 seconds
And [1111-1000] aip_Advances should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switches to tab 1
And [1111-1130] publishers_Title text should contain AIP Advances, Within 20 seconds
And [1111-1000] publications_Browse should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] toc should be displayed, Within 20 seconds
And [1101-0140] Text should contain Table of Contents
And [1101-1080] browse_Volumes should be displayed
And [1101-1080] listof_Browse_Volumes should be displayed
And [1101-1080] pagenation should be displayed
And [1101-1080] display should be displayed
And [1101-1080] left_Arrow should be displayed
And [1000-9140] Close the browser