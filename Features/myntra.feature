Feature: myntra
  @cart
  Scenario: to validate the cart
    Given User open browser  and pass url "https://www.myntra.com/"
    When select the jeans and add cart
    Then check jeans present in cart