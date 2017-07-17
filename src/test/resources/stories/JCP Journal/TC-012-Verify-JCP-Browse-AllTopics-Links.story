
Scenario: TC-012-JCP-Verify Browse Topics Link.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I scroll To ActiveTopic
And I click on BrowseAllTopics
Then URL page sholud be TopicURL 