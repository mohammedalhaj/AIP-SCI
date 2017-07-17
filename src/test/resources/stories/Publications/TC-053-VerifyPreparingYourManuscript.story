Meta:
@production
Scenario: TC-053-Publications - Preparing Your Manuscript page

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on FOR_AUTHORS
And I click on Preparing_Manuscript
Then The Left_Title should be Preparing Your Manuscript
And The header_Title should be Author Instructions



