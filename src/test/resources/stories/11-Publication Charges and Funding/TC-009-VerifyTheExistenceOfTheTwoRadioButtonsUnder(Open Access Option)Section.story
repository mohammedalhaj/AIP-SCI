Scenario: TC-009- Publication Charges and Funding-Verify the existence of the two radio buttons under "Open Access Option" section

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The Open_Access should display
Then The open_access_Yes should display
And The open_access_no should display



