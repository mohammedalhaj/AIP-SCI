Meta:
@production

Scenario: TC-001-Publications  - Verify the publications page (AIP Advances)

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And The Publishers_Title should display
And The Publishers_Title should be AIP Publishing
And I click on AIP_Advances
Then The Publishers_Logo should display
And The Publishers_Title should display
And The Publishers_Title should be AIP Advances
And The Publishers_Home should display
And The Publications_Browse should display
And The Info should display
And The ForAuthors should display
And The SignUpForAlerts should display