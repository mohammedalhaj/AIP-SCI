
Scenario: TC-011-ADV-Verify Active topic.
 
Given I am On ScitationPage
When I scroll To JournalAdvance
And I click on JournalAdvance
And I scroll To ActiveTopic
Then I click on ActiveTopicLink
And The RefineSearch should display