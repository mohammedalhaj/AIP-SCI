Scenario: TC-045-Publications - Verify "Overview" tab

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Info_tab
And I click on Overview
Then The Overview_Title should be Overview
And The Focus_Coverage should be Focus and Coverage
And The Editorial_Policies should be Editorial Policies
And The Overview_Contact should be Contact