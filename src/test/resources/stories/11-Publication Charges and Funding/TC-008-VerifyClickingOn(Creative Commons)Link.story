Scenario: TC-008- Publication Charges and Funding-Verify clicking on "Author's Select" link

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The Open_Access should display
And The Author_Select_Link should display
And The Creative_Commons_Link should display
And I click on Creative_Commons_Link
And I switch tabs
Then The Creative_Commons_Logo should display

