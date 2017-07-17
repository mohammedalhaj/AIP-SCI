
Scenario: TC-011-JCP-Verify Active topic.
 
Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I scroll To ActiveTopic
Then I click on ActiveTopicLink
And The RefineSearch should display