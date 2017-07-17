
Scenario: TC-051-JCP-Verify Clicking On News Tab.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then I hover over INFO
And I click on InfoNews
And The NewsHeader should display
