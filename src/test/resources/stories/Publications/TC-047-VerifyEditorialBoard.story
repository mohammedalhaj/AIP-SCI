Scenario: TC-047 -Publications - Verify "Editorial Board" tab contents

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Info_tab
And I click on Editorial_Board
Then The Left_Title should be Editorial Board
And The header_Title should be Editors