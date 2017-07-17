Meta:
@production

Scenario: TC-018-Footer - Verify Clicking on Help leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on HELP