Scenario: TC-006- Confirm Manuscript Files-Clicking on the File icon under the file tab

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
And I click on Edit_All_btn
Then The Upload_Files_Title should be Upload Files