Scenario: TC-012-Search -Verify the Advanced Search page when the user is logged in - Scitation home page.

Given I am on login page
And user login with Valid_User_Name user name and Valid_Password password.
And The Profile_Welcome should be Mohammed Najjar
When I click on Search_Icon
Then The Advanced_Search_Header should display
And The Advanced_Search_Header should be Advanced Search