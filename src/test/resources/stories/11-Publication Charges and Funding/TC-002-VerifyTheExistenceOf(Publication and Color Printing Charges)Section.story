Meta:
@skip
Scenario: TC-72-Verify the existence of " Publication and Color Printing Charges" section

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The PublicationChargesAndFunding_Title should display
Then The PublicationAnd_Color_Printing_Charges_asterisk should display
And The PublicationAnd_Color_Printing_Charges should be Publication and Color Printing Charges
And The Page_Charges should be Page Charges
And The Free_Color_Online should be Free Color Online
And The Color_Printing_Charges should be Color Printing Charges

