Scenario: TC-006- Publication Charges and Funding-Verify the existence of the clickable links

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The Open_Access should display
Then The Author_Select_Link should display
And The Creative_Commons_Link should display


