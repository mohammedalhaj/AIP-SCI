Meta:
@production
Scenario: TC-012- Physics Today- verify the function of the SIGN UP FOR ALERTS link

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
And I click on AIP_Publisher
And I click on Physics_Today_image
And I click on Physics_Today_SignUp_Alerts
Then The Journal_Alerts_Page should be Journal Alerts