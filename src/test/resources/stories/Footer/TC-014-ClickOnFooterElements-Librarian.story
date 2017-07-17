Meta:
@production

Scenario: TC-014-Footer - Verify Clicking on Librarian leads to the appropriate pages.

Given I am On ScitationPage
When The Page_Footer should display
Then I click on LIBRARIAN