#language: en
Feature: Delete user from service

  Scenario: Deleting an user successfully

    Given We want to delete data from service "https://petstore.swagger.io/v2/user/"
      | userName |
      | Amph7000 |

    Then I validate the code status 200
