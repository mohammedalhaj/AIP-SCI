Meta:
@production

Scenario: TC-004-Publications  - Browse TOC

Given I am On ScitationPage
When I click on  Menu
And I click on Menu_Publishers
And I click on AIP_Publishers_Logo
And The Publishers_Title should be AIP Publishing
And I click on AIP_Advances
And The Publishers_Title should be AIP Advances
And I click on Publications_Browse
Then The TOC should display
And The TOC should be Table of Contents
And The Browse_Volumes should be Browse Volumes 
And The ListOf_Browse_Volumes should display
And The Pagenation should display
And The Display should be DISPLAY : 
And The Left_Arrow should display