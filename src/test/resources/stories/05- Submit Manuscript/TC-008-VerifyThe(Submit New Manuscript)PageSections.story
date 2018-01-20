Scenario: TC-008- Submit Manuscript-Verify the existence of "New Manuscript submission" link 

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
Then The Submit_Manuscrip_Page should display
And The Partial_Submission_HeadLine should display
And The Partial_Submission_HeadLine should be Partial Submission