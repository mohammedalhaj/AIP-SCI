Scenario: TC-021- Upload file-Verify "upload files" page contents
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
Then The Upload_Files_HeadLine should display
And The Upload_Files_HeadLine should be Upload Files
And The Next should display
And The Save_Exit should display
And The Save_Continue should display
And The Cancel_Submission should display
