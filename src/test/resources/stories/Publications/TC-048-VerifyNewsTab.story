Scenario: TC-048-Publications - Verify the existence of "News " option

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And I click on AIP_Advances
And I click on Info_tab
And I click on Info_news
Then The Left_Title should be News
And The Announcements_Title should be Announcements



