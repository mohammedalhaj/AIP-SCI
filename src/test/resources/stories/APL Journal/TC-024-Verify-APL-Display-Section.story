
Scenario: TC-024-APL-Verify Display Section.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The TOCDisplayLabel should display
And The TOCDisplay20 should display
And The TOCDisplay50 should display
And The TOCDisplay100 should display
And The TOCDisplayAll should display