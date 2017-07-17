
Scenario: TC-028-JAP-Show-Abstract Under Each Article.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
Then I click on ShowHideAbstract
And The ShowAbstractText should display
And I click on ShowHideAbstract