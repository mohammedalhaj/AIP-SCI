Scenario: TC-1- Manuscript Information-Verify that "Manuscript File" type is required 
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Audio.mp3 to : Browse
And I click on Upload_Files
And I select Type of Integral_Multimedia
And Fill Integral Multimedia File to : File_title_Text
And Fill Integral Multimedia File to : File_Des_Text
Then I click on Save
Then The Manuscript_File_Required should be Please upload at least 1 Manuscript File.