Scenario: TC-042- Verify the "Browse Volumes" Input field

Given I am On ScitationPage
And I click on Conference_Proceedings
And I click on Publications_Browse
And The Browse_Volumes should display
And I Fill 1835 to : Submit_Volumes
And I click on Submit_Volumes_btn
Then The Submit_Volumes_Result should display