Meta:
@production

Scenario: TC-005-Footer -Footer Authors Page 

Given I am On ScitationPage
When I click on AUTHOR
And I switch tabs
Then The Author_Resource_Center should be Author Resource Center
And The AIP_Scitation should display
And The AIP_China should display
And The Authors_About should display
And The Authors_Publications should display
And The Authors_Librarians should display
And The Authors_Authors should display
And The Authors_Publishing_Partners should display
And The Authors_Advertising_Resources should display
And The Authors_Careers should display
And The Authors_Contact_Us should display
And The Author_Resource_Center should display
And The Before_you_Begin should display
And The Prepare_Your_Manuscript should display
And The Submit_Your_Manuscript should display