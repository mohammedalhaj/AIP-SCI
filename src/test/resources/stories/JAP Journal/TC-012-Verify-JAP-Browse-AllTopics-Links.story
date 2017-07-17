

Scenario: TC-012-JAP-Verify Browse Topics Link.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I scroll To ActiveTopic
Then I click on BrowseAllTopics
And URL page sholud be TopicURL 