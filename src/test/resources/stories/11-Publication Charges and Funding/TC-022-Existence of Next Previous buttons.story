Scenario: TC-022 - Publication Charges and Funding-Verify the existence of "Next" and "Previous" buttons at the bottom of the page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
Then The Next should display
And The Previous should display
