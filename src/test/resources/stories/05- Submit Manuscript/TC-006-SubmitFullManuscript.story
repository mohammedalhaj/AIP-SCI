Scenario: TC-006 - Submit Manuscript-Submit Full Manuscript


Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
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
And I click on Area_option
And I Fill Auto to : keywords 
And I click on Next
And The classifications_green_accept should display
And I click on conflict_interest
And I click on Dual_Submission
And I click on Next
And The Publishing_Permissions_green_accept should display
And I click on open_access_Yes
And Fill sar to : Funder_name
And I click on a_Funder
And Fill Test Test to : funding_comments
And I click on Next
And I click on Include_Add_Reviewer_btn
And Fill G. to : Include_Reviewer_FName
And Fill Alexe to : Include_Reviewer_LName
And Fill alexe@ifp.uni-bremen.de to : Include_Reviewer_Email
And I select Type of Include_Reviewer_Country_Germany
And Fill Universitht Bremen to : Include_Reviewer_Institution
And I click on Include_SaveHide_Btn
And I click on Exclude_Add_Reviewer_btn
And Fill MM to : Exclude_Reviewer_FName
And Fill Hussan to : Exclude_Reviewer_LName
And Fill janiran@gmail.com to : Exclude_Reviewer_Email
And I select Type of Exclude_Reviewer_Country_Germany 
And Fill University of Agriculture Faisal Abad to : Exclude_Reviewer_Institution
And Fill Exclude Reviewer to : Exclude_Comments
And I click on Exclude_SaveHide_Btn
And I click on Next
And I Complete uploading pdf file
And I click on Next
And I click on Next
And I click on Submit_Manuscript_btn
Then ManuScript should be submitted
