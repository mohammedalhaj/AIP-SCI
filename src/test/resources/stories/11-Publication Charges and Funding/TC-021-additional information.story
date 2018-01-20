Scenario: TC-021- Publication Charges and Funding-Verify the existence of "additional information" text box

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
Then The comments_title should display
And The funding_comments should display
