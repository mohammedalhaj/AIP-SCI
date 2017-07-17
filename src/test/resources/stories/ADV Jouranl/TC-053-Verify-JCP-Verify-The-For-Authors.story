
Scenario: TC-053-JCP-Verify The For Authors.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then I hover over Journal_ForAuthors
And The Journal_ForAuthors_PreparingYourManuscript should display
And The Journal_ForAuthors_PublicationCharges should display
And The Journal_ForAuthors_AuthorResources should display
And The Journal_ForAuthors_Submit should display