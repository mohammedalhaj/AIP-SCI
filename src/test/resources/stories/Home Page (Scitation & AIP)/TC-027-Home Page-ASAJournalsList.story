Scenario: TC-027-Home Page - Verify the ASA Journals list (on the left side)

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
Then The ASA_Journal_List Should be The Journal of the Acoustical Society of America
And The ASA_Journal_List Should be JASA Express Letters
And The ASA_Journal_List Should be Proceedings of Meetings on Acoustics
And The ASA_Journal_List Should be Acoustics Today
And The ASA_Journal_List Should be Acoustics Research Letters Online
And The ASA_Journal_List Should be Noise Control
And The ASA_Journal_List Should be Sound: Its uses and Control