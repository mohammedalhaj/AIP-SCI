Scenario: TC-052-Publications - Verify the "FOR AUTHORS" tab

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on FOR_AUTHORS
Then The Preparing_Manuscript should be Preparing Your Manuscript
And The Publication_Charges should be Publication Charges 
And The Author_Resources should be Author Resources
And The Author_Submit should be Submit

