
Scenario: TC-053-APL-Verify The For Authors.

Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
Then I hover over Journal_ForAuthors
And The Journal_ForAuthors_PreparingYourManuscript should display
And The Journal_ForAuthors_PublicationCharges should display
And The Journal_ForAuthors_AuthorResources should display
And The Journal_ForAuthors_Submit should display