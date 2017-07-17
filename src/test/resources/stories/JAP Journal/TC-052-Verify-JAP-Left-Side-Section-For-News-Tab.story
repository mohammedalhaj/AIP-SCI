
Scenario: TC-052-JAP-Verify Left Side Section For News Tab.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then I hover over INFO
And I click on InfoNews
And The NewsAndAnnouncement should display
And The ArticleInTheNews should display
