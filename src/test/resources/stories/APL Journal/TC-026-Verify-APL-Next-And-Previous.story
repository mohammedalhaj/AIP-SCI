
Scenario: TC-026-APL-Verify Next And Previous.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then The PreviousIssue should display
And I click on PreviousIssue
And The NextIssue should display
