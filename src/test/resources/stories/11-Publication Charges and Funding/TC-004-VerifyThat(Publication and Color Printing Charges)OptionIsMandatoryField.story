Meta:
@skip
Scenario: TC-74-Verify that "Publication and Color Printing Charges" option is a mandatory field

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The PublicationChargesAndFunding_Title should display
And I click on Next
And I click on Previous
Then The PublicationAnd_Color_Printing_Charges_ErrorMsg should display
And The PublicationAnd_Color_Printing_Charges_ErrorMsg should be Publication and Color Printing Charges response is required.



