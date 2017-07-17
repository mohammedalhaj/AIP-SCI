Scenario: TC-014-Search - Verify the Advanced Search page when the user is logged out - AIP Publishing & Other Publishers.

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on publishers_Search_Icon
And I click on Search_Icon
Then The Advanced_Search_Header should display
And The Advanced_Search_Header should be Advanced Search