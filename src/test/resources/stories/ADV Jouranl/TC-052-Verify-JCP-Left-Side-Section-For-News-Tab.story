
Scenario: TC-052-JCP-Verify Left Side Section For News Tab.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
Then I hover over INFO
And I click on InfoNews
And The NewsAndAnnouncement should display
And The ArticleInTheNews should display
