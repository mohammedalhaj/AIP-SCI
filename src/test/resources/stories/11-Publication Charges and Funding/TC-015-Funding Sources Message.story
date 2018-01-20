Scenario: TC-015- Publication Charges and Funding-Verify the existence of "Please indicate the funders of the research ..." Sentence

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
Then The Funding_Sources_Message should be Please indicate the funders of the research described in this manuscript and the associated grant reference numbers.