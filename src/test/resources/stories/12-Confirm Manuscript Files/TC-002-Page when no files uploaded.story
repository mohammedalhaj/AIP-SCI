Scenario: TC-002- Confirm Manuscript Files-Confirm Manuscript Files Page when no files uploaded

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Confirm_Files_Tab
Then The Confirm_Files_Title should be Confirm Manuscript Files
And The Confirm_Files_Message should be Please review the file information below. Click the PDF icon indicated by the red arrow
And The Next should display
And The Previous should display
And The Upload_error_msg should be Please upload at least 1 Manuscript File.
And The No_files_Msg should be There are no files to validate.

