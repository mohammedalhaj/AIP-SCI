Meta:
@production

Scenario: TC-008-Publications  - Verify that the shopping cart info is correct

Given I am On ScitationPage
And I Fill Testing procedures to : search_Text
And I click on First_Element
And I click on First_search_Result
And I click on Full_Text
When The Access_Message should display
And The Access_Message should be SELECT YOUR ACCESS
And I Check The Publication_Title Title Text
And I click on Add_To_Cart_Btn
Then The Shopping_Cart should display
And The Shopping_Cart should be Shopping Cart
And The Checkout_Btn should display
And I compair the Publication Title with Shopping_Cart_Publication_Title
