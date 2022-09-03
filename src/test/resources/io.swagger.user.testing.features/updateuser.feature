#language: en

Feature: Update an user

  Scenario: Updating an user succesfully

    Given I want to send data to service "https://petstore.swagger.io/v2/user/"
      | idUser | userName | firstName | lastName | email              | password                 | phone      | userStatus |
      | 80   | Amph7000 | Jeff  | Garzon   | amph7019@gmail.com | Streichholzschachtelchen | 3043261092 | 3          |

    Then I validate the code status 200