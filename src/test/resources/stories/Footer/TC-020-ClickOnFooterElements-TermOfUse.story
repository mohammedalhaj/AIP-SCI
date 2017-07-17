Meta:
@production

Scenario: TC-020-Footer - Verify Clicking on Term Of Use leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on TERMS_OF_USE