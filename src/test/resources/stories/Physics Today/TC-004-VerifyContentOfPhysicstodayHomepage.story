Meta:
@production
Scenario: TC-004- Physics Today-Verify Content Of Physics today Homepage

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_image
Then The Physics_Today_header should display
And The Ad should display
And The share_section should display
And The SignUpForAlerts should display
And The SUBSCRIBE should display
And The Journal_tabs should display

