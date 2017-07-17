Scenario: TC-045-Publications - Verify "Overview" tab

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Info_tab
Then The Overview should be Overview
And The Editorial_Board should be Editorial Board
And The Info_news should be News