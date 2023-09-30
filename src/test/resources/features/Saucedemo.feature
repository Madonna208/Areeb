Feature: Login, adds items to the cart, checks out, then Logout

  Scenario Outline:
    Given the user is on Saucedemo login page
    When the user logs in with valid credentials "<username>", "<password>"
    And adds items to the cart
    And checks out the order "<firstName>", "<lastName>", "<zip>"
    And logs out of the application
    Then the user should be on the login page

    Examples:
      | username      | password     | firstName | lastName | zip   |
      | standard_user | secret_sauce | Madonna   | Emad     | 11757 |
