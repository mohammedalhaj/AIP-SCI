Scenario: TC-001 - Confirm Manuscript Files-Verify the  "Confirm Manuscript Files" title

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
