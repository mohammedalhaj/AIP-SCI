
Scenario: TC-010-JAP-Verify existence of Active Topics.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
Then The ActiveTopic should display
