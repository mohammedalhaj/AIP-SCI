Meta:
@production

Scenario: TC-004-Login - Verify Sign in - Invalid Scenario

Given [1000-9000] User opens Login page
And [1000-3000] User maximize browser window
When [1100-1340] User fills User Name with `InValid_User_Name`
And [1100-1340] User fills Password with `InValid_Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] signInErrorMsg should be displayed, Within 20 seconds
And [1101-0140] Text should contain Your email or password is incorrect. Please try again.