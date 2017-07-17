Meta:
@production

Scenario: TC-006-Footer -Footer librarians Page 

Given I am On ScitationPage
When I click on LIBRARIAN
And I switch tabs
Then The Library_Resource_Center should be Library Resource Center
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
And The Promote_your_Collection should display
And The Manage_your_Collection should display