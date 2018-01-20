Scenario: TC-004 - Submit Manuscript-Submit Manuscript Erratum

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Erratum
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I click on Manuscript_File
And I click on Next
And The green_accept should display
And I write Manuscript title to : ManuScript_title
And I click on Next
And The Title/Abstract_green_accept should display
And I click on Contributing_Author_Agreement
And I click on Next
And The authorinfo_green_accept should display
And I Complete uploading pdf file
And I click on Next
And I click on Next
And I click on Submit_Manuscript_btn
Then The submission_msg should be Your manuscript has been submitted. Your manuscript tracking number is:
