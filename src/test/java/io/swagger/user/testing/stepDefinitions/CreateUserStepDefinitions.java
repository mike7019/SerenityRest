package io.swagger.user.testing.stepDefinitions;

import cucumber.api.java.en.*;
import io.swagger.user.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class CreateUserStepDefinitions {

    @Given("^We want to send data to service \"([^\"]*)\"$")
    public void weWantToSendDataToService(String url, List<User> userList) {

        String body = "{\n" +
                "  \"id\": " + userList.get(0).getIdUser() + ",\n" +
                "  \"username\": \"" + userList.get(0).getUserName() + "\",\n" +
                "  \"firstName\": \"" + userList.get(0).getFirstName() + "\",\n" +
                "  \"lastName\": \"" + userList.get(0).getLastName() + "\",\n" +
                "  \"email\": \"" + userList.get(0).getEmail() + "\",\n" +
                "  \"password\": \"" + userList.get(0).getPassword() + "\",\n" +
                "  \"phone\": \"" + userList.get(0).getPhone() + "\",\n" +
                "  \"userStatus\": " + userList.get(0).getUserStatus() + "\n" +
                "}";

        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").post();


    }

    @Then("^I validate the code status (\\d+)$")
    public void iValidateTheCodeStatus(int status) {

        SerenityRest.lastResponse().then().statusCode(status);
        System.out.println(SerenityRest.lastResponse().prettyPrint());
        System.out.println("The status code is: "+SerenityRest.lastResponse().getStatusCode());


    }
}
