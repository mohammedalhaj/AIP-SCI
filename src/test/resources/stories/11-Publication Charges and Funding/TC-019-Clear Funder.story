Scenario: TC-019- Publication Charges and Funding-Verify clicking on "Clear" Button

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And Fill sar to : Funder_name
And I click on a_Funder
And I click on clear_funder
Then The Funder_name Textbox sould be empty