
Scenario: TC-028-APL-Show-Abstract Under Each Article.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I click on ISSUES
Then I click on ShowHideAbstract
And The ShowAbstractText should display
And I click on ShowHideAbstract

