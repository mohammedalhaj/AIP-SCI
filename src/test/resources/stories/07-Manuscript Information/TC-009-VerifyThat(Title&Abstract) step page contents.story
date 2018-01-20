Scenario: TC-9- Manuscript Information-Verify that "Title/Abstract" step page contents
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Next
Then The Title_Abstract should display
And The Title_Abstract should be Title/Abstract
And The Title_Helper_Text should display
And The Word_Count_Estimate_Helper_Text should display
And The Significance_Statement_Helper_Text should display
And The Related_Manuscript_Helper_Text should display
And The Word_Count_Estimate should display


