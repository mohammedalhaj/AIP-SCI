Meta:
@production

Scenario: TC-016-Footer - Verify Clicking on About leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on ABOUT