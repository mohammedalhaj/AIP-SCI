Meta:
@production

Scenario: TC-022-Footer - Verify Clicking on Twitter leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on Twitter_Icon