Scenario: TC-009 - Submit Manuscript-Verify the "Erratum" manuscript steps

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Erratum
And I click on Type_Continue
Then The summary_label should be Erratum
And The Upload_tab should display
And The title_tab should display
And The Author_Information_Tab should display
And The Confirm_Files_Tab should display
And The submit_tab should display
And The Save_Exit should display
And The Save_Continue should display
And The Cancel_Submission should display



