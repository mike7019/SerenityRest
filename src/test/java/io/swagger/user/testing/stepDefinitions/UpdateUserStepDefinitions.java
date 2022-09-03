package io.swagger.user.testing.stepDefinitions;

import cucumber.api.java.en.Given;
import io.swagger.user.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class UpdateUserStepDefinitions {

    @Given("^I want to send data to service \"([^\"]*)\"$")
    public void iWantToSendDataToService(String url, List<User> userList) {

        url = url + userList.get(0).getUserName();
        System.out.println(url);



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
        SerenityRest.given().baseUri(url).header("accept","application/json").put();
        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").put();

    }
}
