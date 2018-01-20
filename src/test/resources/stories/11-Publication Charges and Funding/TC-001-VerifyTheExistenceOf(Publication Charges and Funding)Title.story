Scenario: TC-001 -Publication Charges and Funding-Verify the existence of "Publication Charges and Funding" title

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The PublicationChargesAndFunding_Title should display
Then The PublicationChargesAndFunding_Title should be Publication Charges and Funding

