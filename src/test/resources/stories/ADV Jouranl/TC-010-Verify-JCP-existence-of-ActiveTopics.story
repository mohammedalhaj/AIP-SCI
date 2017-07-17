
Scenario: TC-010-ADV-Verify Existence of Active Topic.
 
Given I am On ScitationPage
When I scroll To JournalAdvance
And I click on JournalAdvance
Then The ActiveTopic should display
And The ActiveTopic-GeneralPhysics should display
And The ActiveTopic-CondensedMatter should display
And The ActiveTopic-MaterialsScience should display