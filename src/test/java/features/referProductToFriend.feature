
  Feature:referProductToAFriend
    @referProduct
Scenario: As a Registered User,I should be able to refer a product to a Friend successfully
      so that He/She can purchase it
  Given I am registered user
  And I am logged into my account
  And I am on homepage
  When I click on Apple MacBook-13 ADD TO CART Button
  And I am on product page
  When I click on Email a friend button
  Then Email a friend page should appear
  And I enter required Email a friend Details
  And I click on send email button
  Then A successfully sent email message should be displayed

