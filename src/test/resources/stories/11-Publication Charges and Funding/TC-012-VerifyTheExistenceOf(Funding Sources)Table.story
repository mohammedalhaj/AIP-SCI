Scenario: TC-012- Publication Charges and Funding-Verify the existence of "Funding Sources" Table

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on PublicationChargesAndFunding_Tab
And The Funding_Sources should display
Then The Funding_Sources should be Funding Sources
And The Funding_Sources_table should display
And The Funding_Sources_FirstFunder_ClearBtn should display
And The Funding_Sources_FirstFunder_TextBox should display
And The Funding_Sources_SecondFunder_ClearBtn should display
And The Funding_Sources_SecondFunder_TextBox should display
And The Funding_Sources_ThirdFunder_ClearBtn should display
And The Funding_Sources_ThirdFunder_TextBox should display
And The Funding_Sources_FourthFunder_ClearBtn should display
And The Funding_Sources_FourthFunder_TextBox should display