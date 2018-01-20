Scenario: TC-026- Upload file-Verify Save and Exit before upload file
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on continues
And I click on Save_Exit
Then The Home_Page should display
And The Message_Saved_data should be Submission data saved.
