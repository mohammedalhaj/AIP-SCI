Scenario: TC-050-Publications - Verify Info Tab content

Given I am On ScitationPage
And I click on Conference_Proceedings
And I click on Info_tab
And I click on Overview
And I click on Focus_Coverage
Then The header_Title should be AIP Conference Proceedings
And I click on CP_Contact
And The CP_header_Title should be Contact