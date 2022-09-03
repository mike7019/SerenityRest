#language: en

  Feature: Get user from service

    Scenario: Getting an user successfully

      Given We want to get data from service "https://petstore.swagger.io/v2/user/"
      |userName|
      |Amph7000|

      Then I validate the code status 200
