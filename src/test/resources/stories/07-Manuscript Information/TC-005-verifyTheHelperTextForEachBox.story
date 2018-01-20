Scenario: TC-5- Manuscript Information-verify the Helper text for each box
 
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
Then The Title_Helper_Text should display
And The Word_Count_Estimate_Helper_Text should display
And The Significance_Statement_Helper_Text should display
And The Related_Manuscript_Helper_Text should display
And The Title_Helper_Text should be Please enter a manuscript title.
And The Word_Count_Estimate_Helper_Text should be What is the estimated word count for your manuscript? For detailed instructions to estimate word count see the journal guidelines.
And The Significance_Statement_Helper_Text should be Authors are asked to provide a brief explanation of the significance and originality of their contribution as well as how it advances the field.
