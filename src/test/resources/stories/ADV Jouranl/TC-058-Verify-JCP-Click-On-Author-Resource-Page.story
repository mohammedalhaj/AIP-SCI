
Scenario: TC-058-JCP-Verify Click On Author Resource Page.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then I hover over Journal_ForAuthors
And I click on Journal_ForAuthors_AuthorResources
And I switch tabs
And The For-Author-AuthorResource-Header should be Author Resource Center

