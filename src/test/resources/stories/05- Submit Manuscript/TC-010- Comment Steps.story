Scenario: TC-010 - Submit Manuscript-Verify the "Comment/Response" manuscript steps

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Comment/Response
And I click on Type_Continue
Then The summary_label should be Comment/Response
And The Upload_tab should display
And The title_tab should display
And The Author_Information_Tab should display
And The MS_Classification_Tab should display
And The Publishing_Permissions_Tab should display
And The Publication_Funding_Tab should display
And The Reviewers_Tab should display
And The Confirm_Files_Tab should display
And The Confirm_Information_Tab should display
And The submit_tab should display
And The Save_Exit should display
And The Save_Continue should display
And The Cancel_Submission should display