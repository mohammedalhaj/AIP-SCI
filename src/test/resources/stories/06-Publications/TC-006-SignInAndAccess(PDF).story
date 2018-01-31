Meta:
@production

Scenario: TC-006-Publications  - Sign in and access a PDF

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1100-1340] User fills search_Text with `searchvalue`
And [1111-1000] SearchIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] First_Search_Result should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Full_Text should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1130] Access_Message text should contain SELECT YOUR ACCESS, Within 20 seconds
And [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] the_Login_Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Access_Pdf should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1011-0000] Page Url should contain pdf, Within 20 seconds

