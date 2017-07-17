Meta:
@production

Scenario: TC-019-Footer - Verify Clicking on Privacy Policy leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on PRIVACY_POLICY