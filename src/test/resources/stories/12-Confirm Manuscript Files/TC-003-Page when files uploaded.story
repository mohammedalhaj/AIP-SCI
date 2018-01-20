Scenario: TC-003- Confirm Manuscript Files-Verify Confirm Manuscript Files Page when files uploaded

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I click on Manuscript_File
And I click on Next
And I click on Confirm_Files_Tab
Then The Confirm_Files_Title should be Confirm Manuscript Files
And The Confirm_Files_Message should be Please review the file information below. Click the PDF icon indicated by the red arrow
And The File_Name_Table should display
And The Edit_All_btn should display
And The Next should display
And The Previous should display