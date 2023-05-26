Feature: Category


#  Scenario Outline: As a user,i should be able to navigate to all categories
  #  Given I am on DemonopCommerce home page
#    When I am click on "<button_name>" button
#    Then I should able to verify I am navigated to related page"<page_url>" successfully
#    And I should able to verify the page title as"<page_title>"
#    Examples:
#    |button_name|page_url|page_title|
#    | Computers         | https://demo.nopcommerce.com/computers         | Computers         |
#    | Electronics       | https://demo.nopcommerce.com/electronics       | Electronics       |
#    | Apparel           | https://demo.nopcommerce.com/apparel           | Apparel           |
#    | Digital downloads | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
#    | Books             | https://demo.nopcommerce.com/books             | Books             |
#    | Jewelry           | https://demo.nopcommerce.com/jewelry           | Jewelry           |
#    | Gift Cards        | https://demo.nopcommerce.com/gift-cards        | Gift Cards        |

  @category
Scenario:As a user, I should able to hover over the category link, verify the color changes
  and i should be able to navigate to sub category page successfully
    Given I am on DemonopCommerce home page
    When I hover over "Computers" category link
    Then I should be able to verify after hover changes color of category
    When I click on "Notebooks" subcategory
    Then I should able to navigated to "/notebooks" page successfully


