Scenario: TC-022- Upload file-Verify selecting "Figure" at a file type
 
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
Then The Save should display
And The Figure_Number should display
And The Cancel_After_upload should display