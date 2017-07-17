Meta:
@production

Scenario: TC-005-Publications  - A user navigating to a Journal home, then Browse TOC, find an article and access the various tools on the page

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And The Publishers_Title should be AIP Publishing
And I click on AIP_Advances
And The Publishers_Title should be AIP Advances
And I click on Publications_Browse
And I Choose one of TOC Browse volumes
And I select one of TOC_Articles
Then The Abstract should display
And The Figure should display
And The Tools should display
And The Share should display
And The Metrics should display
And The View_Affiliations should display
And The Journal_Logo should display
And The Journal_Title should display
And The Journal_Home should display
And The Journal_Browse should display
And The Journal_Info should display
And The Journal_ForAuthors should display
And The SignUpForAlerts should display
And The Menu should display