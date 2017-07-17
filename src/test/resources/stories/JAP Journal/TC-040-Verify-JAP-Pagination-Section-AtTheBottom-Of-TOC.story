
Scenario: TC-040-JAP-Verify Pagination Section At The Bottom of TOC.
 
Given I am On ScitationPage
When I scroll To JournalAppliedPhysics
And I click on JournalAppliedPhysics
And I click on browse
And I scroll To TOCPagination
Then I click on TOCPage1
And I scroll To TOCPagination
And I click on TOCPage2
And I scroll To TOCPagination
And I click on TOCNextPage
