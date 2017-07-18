Meta:
@production

Scenario: TC-009-Publications  - Buy the article (add to cart) 

Given I am On ScitationPage
And I Fill Hopf bifurcation in a nonlocal nonlinear transport equation stemming from stochastic neural dynamics to : search_Text
And I click on SearchIcon
And I click on First_search_Result
And I click on Full_Text
And The Access_Message should display
When The Access_Message should be SELECT YOUR ACCESS
And I click on Add_To_Cart_Btn
Then The Shopping_Cart should display
And The Shopping_Cart should be Shopping Cart
And The Price should be PRICE
And The Price_Number should display