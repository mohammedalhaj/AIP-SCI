Meta:
@production

Scenario: TC-001-Login -Verify "Sign in" page sections.

Given I am On ScitationPage
When I click on SignIn_Btn
Then The username should display
And The password should display
And The Login_button should display
And The KeepMeLoggedIn_Switch should display



