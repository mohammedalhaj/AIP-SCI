Scenario: TC-027- Upload file-Verify Save and Exit after upload file
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on continues
And I upload Test.docx to : Browse
And I click on Upload_Files
And I click on Manuscript_File
And I click on Save_Exit
Then The Home_Page should display