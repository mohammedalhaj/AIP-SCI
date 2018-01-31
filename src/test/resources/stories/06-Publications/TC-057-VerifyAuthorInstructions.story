Meta:
@production
Scenario: TC-057-Publications - Author Instructions

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] Menu should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Menu_Publishers should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] aip_Publishers_Logo should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Aip_Advances should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switches to tab 1
And [1111-1000] for_Authors_Advance should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Preparing_Manuscript should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Author_Instructions should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] Microsoft_Word text should contain Microsoft Word, Within 20 seconds
And [1111-1130] Preparing_Graphics text should contain Preparing Graphics, Within 20 seconds
And [1000-9140] Close the browser
