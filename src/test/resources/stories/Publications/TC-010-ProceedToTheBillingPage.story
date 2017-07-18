Meta:
@production

Scenario: TC-010-Publications - Verify you can proceed to the billing page 

Given I am On ScitationPage
And I Fill Hopf bifurcation in a nonlocal nonlinear transport equation stemming from stochastic neural dynamics to : search_Text
And I click on SearchIcon
And I click on First_search_Result
And I click on Full_Text
When The Access_Message should display
And The Access_Message should be SELECT YOUR ACCESS
And I Check The Publication_Title Title Text
And I click on Add_To_Cart_Btn
And The Shopping_Cart should display
And The Shopping_Cart should be Shopping Cart
And The Price should be PRICE
And The Price_Number should display
And I click on Checkout_Btn
And I Fill MHamad@aspire-infotech.net to : username
And I Fill Test@123456 to : password
And I click on Signin_Button
Then The Billing_Information should display
And The Billing_Information should be Billing Information
