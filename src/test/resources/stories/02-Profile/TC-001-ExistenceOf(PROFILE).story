Meta:
@production

Scenario: TC-001-Profile -Verify the existence of PROFILE.

Given [1000-9000] User opens home page
And [1000-3000] User maximize browser window
When [1111-1000] Signin_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Profile_Welcome should be displayed, Within 20 seconds
And [1101-0140] Text should contain Mohammed Najjar
And [1111-1000] Profile_Welcome should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] Profile should be displayed, Within 20 seconds