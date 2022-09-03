#language: en

Feature: Creating an user

  Scenario: Create an user succesfully

    Given We want to send data to service "https://petstore.swagger.io/v2/user"
      | idUser | userName | firstName | lastName | email              | password                 | phone      | userStatus |
      | 30  | Amph7000 | Michael   | Garzon   | amph7019@gmail.com | Streichholzschachtelchen | 3043261092 | 1          |

    Then I validate the code status 200

