Meta:
@production

Scenario: TC-001-Publishers - Verify Publishers option in Menu List

Given I am On ScitationPage
When I click on  Menu
Then The Menu_Publishers should display
