Scenario: TC-034- Physics Today- Verify the "Info" dropdown list

Given I am On ScitationPage
When I click on AIP_Publisher
And I click on Physics_Today_Journal
And I click on Info_List
Then The Info_About should be About
And The Info_Contact_Us should be Contact Us
And The Info_Submit_Content should be Submit Content
And The Info_Advertising should be Advertising
And The Info_Buyer_Guide should be Buyer's Guide

