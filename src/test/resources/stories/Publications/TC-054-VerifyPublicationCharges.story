Meta:
@production
Scenario: TC-054-Publications - Verify Publication Charges page

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on FOR_AUTHORS
And I click on Publication_Charges
Then The Left_Title should be Publication Charges
And The header_Title should be Publication Charges

