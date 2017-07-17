Meta:
@production

Scenario: TC-058-Verify Publication Charges LHS Options

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on FOR_AUTHORS
And I click on Publication_Charges
And I click on Publication_Charges_Option
And The header_Title should be Publication Charges
And I click on Waiver_Policy
And The header_Title should be Waiver Policy
And I click on APC_Refund_Policy
Then The Left_Title should be APC Refund Policy
