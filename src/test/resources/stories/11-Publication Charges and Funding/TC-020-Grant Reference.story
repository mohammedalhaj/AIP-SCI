Scenario: TC-020- Publication Charges and Funding-Verify entering data into "Grant Reference Number" field

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
Then Fill 20 to : grant_num
