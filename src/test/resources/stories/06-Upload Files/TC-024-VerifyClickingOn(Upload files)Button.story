Scenario: TC-024- Upload file-Verify clicking on "Upload files" button"
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Figure.jpg to : Browse
And I click on Upload_Files
And I select Type of Figure_option
And Fill 2 to : Figure_Number
And I click on Save
Then The Edit_Btn should display
And The Move_Btn should display
And The Delete_Btn should display
