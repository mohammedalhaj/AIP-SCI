Meta:
@production

Scenario: TC-012-Footer -Footer Terms Of Use Page 

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] terms_Of_Use_Main should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] the_Terms_Of_Use should be displayed, Within 20 seconds
And [1101-0140] Text should contain Terms Of Use
And [1101-1080] Terms_Of_Use_Scitation_Logo should be displayed