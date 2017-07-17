
Scenario: TC-028-JCP-Show-Abstract Under Each Article.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then I click on ShowHideAbstract
And The ShowAbstractText should display
And I click on ShowHideAbstract

