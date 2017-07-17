Scenario: TC-005-Search - Verify Search Dropdown menu (Anywhere & Citation).

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
Then I click on publishers_Search_Icon
And The search_Text should display
And I click on Search_Dropdown_Menu
And The Anywhere should display
And The Citation should display
