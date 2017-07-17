Meta:
@production

Scenario: TC-021-Footer - Verify Clicking on FaceBook leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on Facebook_Icon