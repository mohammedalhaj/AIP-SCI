Scenario: TC-001-Search - Verify the existance of the Quick search section when the user is logged out - Scitation home page.

Given I am On ScitationPage
When The Scitation_logo should display
Then The search_Text should display
And The Search_Icon should display
And The Menu should display
And The SignIn_Btn should display
And The ScitationHome_text should be Scitation is home to the most influential news, comment, analysis and research in the Physical Sciences.

