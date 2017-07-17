
Scenario: TC-038-APL-Verify Author Name On TOC.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The TOCAuthors should display
And I click on TOCAuthors
