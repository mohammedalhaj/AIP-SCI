
Scenario: TC-006-ADV-Verify Main Menu Bar.
 
Given I am On ScitationPage
When I scroll To JournalAdvance
And I click on JournalAdvance
Then The Home should display
And The browse should display
And The Info should display
And The Journal_ForAuthors should display