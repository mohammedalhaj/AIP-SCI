Meta:
@production

Scenario: TC-013-Footer - Verify Clicking on Author leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on AUTHOR