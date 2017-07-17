
Scenario: TC-012-APL-Verify Browse Topics Link.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I scroll To ActiveTopic
And I click on BrowseAllTopics
Then URL page sholud be TopicURL 