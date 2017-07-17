
Scenario: TC-011-JAP-Verify Active Topics Links.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I scroll To ActiveTopic
Then I click on ActiveTopicLink
And The RefineSearch should display