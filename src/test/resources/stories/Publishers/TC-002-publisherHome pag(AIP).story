Meta:
@production

Scenario: TC-002-Publishers - Verify the Home page for Publisher  AIP 

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
Then The Publishers_Title should display
And The Publishers_Title should be AIP Publishing
And The Publishers_Home should display
And The Publishers_Browse should display
And The SignUpForAlerts should display
And The Publishers_Publications should display
And The Publishers_Publications should be Publications 
And The publicationCoverImage should display
And The Publishers_Featured should display
And The Publishers_Featured should be Featured 