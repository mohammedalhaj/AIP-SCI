Meta:
@production

Scenario: TC-002-Registration -Verify the existence of registration page sections

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] the_SignIn_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] registerationpage_Headline should be displayed, Within 20 seconds
And [1101-0140] Text should contain Register
And [1101-1080] registeration_Firstname_Textbox should be displayed
And [1101-1080] registeration_Lasttname_Textbox should be displayed
And [1101-1080] registeration_Password_Textbox should be displayed
And [1101-1080] registeration_Email_Textbox should be displayed
And [1101-1080] registerationpage_Register_Btn should be displayed
And [1101-1080] registerationpage_Cancel_Btn should be displayed