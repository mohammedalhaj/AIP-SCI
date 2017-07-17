
Scenario: TC-012-ADV-Verify Browse Topics Link.
 
Given I am On ScitationPage
When I scroll To JournalAdvance
And I click on JournalAdvance
And I scroll To ActiveTopic
And I click on BrowseAllTopics
Then URL page sholud be TopicURL 