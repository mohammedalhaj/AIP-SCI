
Scenario: TC-040-JCP-Verify Pagination Section At The Bottom of TOC .

Given I am On ScitationPage
When I scroll To JournalChemicalPhysics
And I click on JournalChemicalPhysics
And I click on ISSUES
And I scroll To TOCPagination
Then I click on TOCPage1
And I scroll To TOCPagination
And I click on TOCPage2
And I scroll To TOCPagination
And I click on TOCNextPage
