Scenario: TC-010-Search -Verify the Advanced Search page when the user is logged out - Scitation home page.
Given I am On ScitationPage
When The Search_Icon should display
And I click on Search_Icon
Then The Advanced_Search_Header should display
And The Advanced_Search_Header should be Advanced Search