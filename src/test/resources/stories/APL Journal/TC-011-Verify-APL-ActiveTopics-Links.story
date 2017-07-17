
Scenario: TC-011-APL-Verify Active topic.
 
Given I am On ScitationPage
When I scroll To App-Physics-Letters
And I click on App-Physics-Letters
And I scroll To ActiveTopic
Then I click on ActiveTopicLink
And The RefineSearch should display