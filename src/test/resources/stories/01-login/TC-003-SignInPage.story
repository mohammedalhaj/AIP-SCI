Meta:
@production

Scenario: TC-003-Login -Verify "Sign in" page sections.

Given [1000-9000] User opens Login page
And [1000-3000] User maximize browser window
When [1111-1080] User Name should be displayed, Within 30 seconds
Then [1101-1080] password should be displayed
And [1101-1080] Login Button should be displayed
And [1101-1080] keepmeloggedin_Switch should be displayed