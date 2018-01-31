Meta:
@production

Scenario: TC-007-Publications  - While not logged in , Try to access the PDF

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1100-1340] User fills search_Text with `searchvalue`
And [1111-1000] SearchIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] first_Search_Result should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] access_Pdf should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1130] Access_Message text should contain SELECT YOUR ACCESS, Within 20 seconds