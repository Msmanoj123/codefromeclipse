Feature: luma
#  @cart
#  Scenario:To add item to cart and check it is present in cart or not
#    Given User launch browser and send url "https://magento.softwaretestingboard.com/"
#    When user select men and jackets
#    And add item to cart
#    Then check the added item in the cart

  @order
  Scenario: To order the item
    Given User launch browser and send url "https://magento.softwaretestingboard.com/"
    When user add item to cart and order
    Then check order is placed