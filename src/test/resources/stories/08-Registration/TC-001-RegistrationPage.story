Meta:
@production

Scenario: TC-001-Registration -Verify the Registration page

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] the_SignIn_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] the_Register_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1101-1080] registerationpage_Headline should be displayed
And [1101-0140] Text should contain Register