Scenario: TC-002-Search - Verify the existance of the Quick search section when the user is logged out - AIP Publishing & Other Publishers.

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
Then I click on publishers_Search_Icon
And The search_Text should display
And The publishers_Search_Icon should display
And The Menu should display
And The SignIn_Btn should display