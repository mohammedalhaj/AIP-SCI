Meta:
@production
Scenario: TC-027- Physics Today- verify the footer

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
Then The Resources should display
And The AUTHOR should display
And The LIBRARIAN should display
And The ADVERTISER should display
And The General_Information should display
And The ABOUT should display
And The CONTACT should display
And The HELP should display
And The PRIVACY_POLICY should display
And The TERMS_OF_USE should display
And The FOLLOW_AIP_PUBLISHING should display
And The Facebook_Icon should display
And The Twitter_Icon should display
And The Linkedin_Icon should display