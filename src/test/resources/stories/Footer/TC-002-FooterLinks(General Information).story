Meta:
@production

Scenario: TC-002-Footer - Verify the existence of General Information section
Given I am On ScitationPage
When The General_Information should display
Then The ABOUT should display
And The CONTACT should display
And The HELP should display
And The PRIVACY_POLICY should display
And The TERMS_OF_USE should display
And The FOLLOW_AIP_PUBLISHING should display
And The Facebook_Icon should display
And The Twitter_Icon should display
And The Linkedin_Icon should display