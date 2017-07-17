Scenario: TC-015-Publications - Verify the "SUBMIT YOUR ARTICLE" button

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Advances_Journal_List
And I click on SignUpForAlerts
Then The Login_Required_msg should display