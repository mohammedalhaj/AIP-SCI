
Scenario: TC-049-JAP-Verify Left Hand Section Editorial Board.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then I hover over INFO
And I click on InfoEditorialBoard
And The Editors should display
And The EditorialAdvisoryBoard should display
