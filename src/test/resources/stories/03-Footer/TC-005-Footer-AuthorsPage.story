Meta:
@production

Scenario: TC-005-Footer -Footer Authors Page 

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] author_Main should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switches to tab 1
Then [1111-1080] Author_Resource_Center should be displayed, Within 20 seconds
And [1101-0140] Text should contain Author Resource Center
And [1101-1080] Aip_Scitation should be displayed
And [1101-1080] Aip_China should be displayed
And [1101-1080] Authors_About should be displayed
And [1101-1080] Authors_Publications should be displayed
And [1101-1080] Authors_Librarians should be displayed
And [1101-1080] Authors_Authors should be displayed
And [1101-1080] Authors_Publishing_Partners should be displayed
And [1101-1080] Authors_Advertising_Resources should be displayed
And [1101-1080] Authors_Careers should be displayed
And [1101-1080] Authors_Contact_Us should be displayed
And [1101-1080] Author_Resource_Center should be displayed
And [1101-1080] before_You_Begin should be displayed
And [1101-1080] prepare_Your_Manuscript should be displayed
And [1101-1080] submit_Your_Manuscript should be displayed
And [1000-9140] Close the browser