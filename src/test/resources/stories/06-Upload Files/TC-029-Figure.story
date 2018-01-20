Scenario: TC-029- Upload file-File Type - Figure
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I select Type of Manuscript_File
And I upload Figure.jpg to : Browse
And I click on Upload_Files
And I select Type Second of Figure_option
And Fill 2 to : Figure_Number
And I click On Second Artical Save
And I click on Next
Then The green_accept should display
