Meta:
@production

Scenario: TC-003-Registration -Verify that validation error appears when one of the fields is empty

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] the_SignIn_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] the_Register_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] registerationpage_Register_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] registerationpage_Errormsg should be displayed, Within 20 seconds
And [1101-0140] Text should contain Fields highlighted in red are required.
