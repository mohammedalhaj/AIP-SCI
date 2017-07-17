Scenario: TC-029 - Verify the EXPORT CITATION option

Given I am on login page
When user login with Valid_User_Name user name and Valid_Password password.
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Publications_Browse
And I click on Export_Citation
And I switch tabs
Then The Formats should display
And The Download_article_btn should display
