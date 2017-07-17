
Scenario: TC-031-JCP-Verify Share Button In Article.

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
Then I click on TOCShare
And The Share_email should display
And The Share_FB should display
And The Share_LinkedIn should display
And The Share_twitter should display
And The Share_librarians should display
