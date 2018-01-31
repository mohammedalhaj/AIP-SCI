Meta:
@production

Scenario: TC-006-Footer -Footer librarians Page 


Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] librarian_Main should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switches to tab 1
Then [1111-1080] Library_Resource_Center should be displayed, Within 20 seconds
And [1101-0140] Text should contain Library Resource Center
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
And [1101-1080] promote_Your_Collection should be displayed
And [1101-1080] manage_Your_Collection should be displayed
And [1000-9140] Close the browser