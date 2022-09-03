#language: en
Feature: Creating an user

  Given We want to send data to service "https://petstore.swagger.io/v2/"
    |idUser|userName|firstName|lastName|email|password|phone|userStatus|
    |7019|Amph7019|Michael|Garzon|amph7019@gmail.com|Streichholzschachtelchen|3043261092|available|
  Then We validate the 200 code status
