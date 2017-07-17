Meta:
@production

Scenario: TC-004-Footer -Verify the existence of copy rights section

Given I am On ScitationPage
When The Page_Footer should display
Then The Footer_Copyright should display
