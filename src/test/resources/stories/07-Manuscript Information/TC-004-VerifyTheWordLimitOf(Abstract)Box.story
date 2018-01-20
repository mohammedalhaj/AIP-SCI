Scenario: TC-4- Manuscript Information-Verify the word limit of "Abstract" Box.
 
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
And I write 251_words  to : ManuScript_Abstract
Then The Word_Count_Error should display
And The Word_Count_Error should be 2 words over
