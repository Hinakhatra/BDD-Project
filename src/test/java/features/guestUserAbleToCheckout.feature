Feature: guestUser able to Checkout
  @guestUser

  Scenario: As a guest user I should be able to checkout successfully with desire product
    Given I am on DemonopCommerce home page
    When I click on Build Your Own Computer image
    Then I should able to navigate to related product page
    When I select all the required pc configuration
    And I click On ADD TO CART Button
    And I click on Shopping cart Button
    Then I should able to navigate to shopping cart page
    And I should able to verify desired product with configuration in shopping cart
    When I click on checkbox of Terms and Conditions and i click on Checkout Button
    Then I should able to navigate to Checkout as guest page
    And I click on CHECKOUT AS GUEST Button
    And I should able to navigate to Checkout Billing page
    When I fill all required details and i click on continue button
    Then I should able to navigate to shipping method page
    And I click on NextDay Air radio Button and i click on CONTINUE Button
    And I click on credit Card radio Button and i click on CONTINUE Button
    When I fill all required payment information and i click on CONTINUE Button
    And I click on CONFIRM Button
    Then I should able to see the message Your order has been successfully processed!







