Meta:
@skip
Scenario: TC-73-Verify the existence of the three radio buttons under "Publication and Color Printing Charges " option

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The PublicationChargesAndFunding_Title should display
Then The NoColorFigures_RadioBtn should display
And The AgreeToPay_RadioBtn should display
And The NoCharge_RadioBtn should display
And The PublicationAnd_Color_Printing_Charges_Comment should display


