
Scenario: TC-006-APL-Verify Main Menu Bar.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then The Home should display
And The ISSUES should display
And The Info should display
And The Journal_ForAuthors should display