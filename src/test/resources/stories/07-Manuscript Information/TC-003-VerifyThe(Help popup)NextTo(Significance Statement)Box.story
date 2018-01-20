Scenario: TC-3- Manuscript Information-Verify the "Help popup" next to  "Significance Statement" box.
 
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
And The green_accept should display
Then The Significance_Statement_Help_popup should display
And I click on Significance_Statement_Help_popup
And The Significance_Statement_Help_Box should display