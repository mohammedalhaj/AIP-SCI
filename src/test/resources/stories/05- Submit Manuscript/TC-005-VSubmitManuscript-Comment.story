Scenario: TC-005 - Submit Manuscript-Submit Manuscript Comment/Response

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Comment/Response
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I click on Manuscript_File
And I click on Next
And The green_accept should display
And I write Manuscript title to : ManuScript_title
And I write ManuScript Abstract  to : ManuScript_Abstract
And I Fill 1 to : Word_Count_Estimate
And I click on Next
And The Title/Abstract_green_accept should display
And I click on Contributing_Author_Agreement
And I click on Next
And The authorinfo_green_accept should display
And I Fill Auto to : keywords 
And I click on Next
And The classifications_green_accept should display
And I click on conflict_interest
And I click on Dual_Submission
And I click on Next
And The Publishing_Permissions_green_accept should display
And I click on open_access_no
And I click on Next
And The Publication_Charges_green_accept should display
And I click on Next
And The Reviewers_green_accept should display
And I Complete uploading pdf file
And I click on Next
And I click on Next
And I click on Submit_Manuscript_btn
Then The submission_msg should be Your manuscript has been submitted. Your manuscript tracking number is:
