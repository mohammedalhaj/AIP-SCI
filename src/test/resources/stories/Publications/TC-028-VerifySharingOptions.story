Scenario: TC-028- Verify the "SHARE" option

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
And The show_Abs_Link should be Show Abstract
And I click on Share_link
Then The Share_email should be E-MAIL
And The Share_FB should be FACEBOOK
And The Share_LinkedIn should be LINKEDIN
And The Share_twitter should be TWITTER
And The Share_librarians should be RECOMMENDED TO LIBRARIANS
