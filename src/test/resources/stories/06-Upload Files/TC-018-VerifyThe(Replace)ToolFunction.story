Scenario: TC-018- Upload file-Verify the (Replace) tool function
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I select Type of  Manuscript_File
Then I upload Cover.docx to : Replace_Browse_Btn