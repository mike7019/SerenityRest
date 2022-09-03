package io.swagger.user.testing.stepDefinitions;

import cucumber.api.java.en.Given;
import io.swagger.user.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class DeleteUserStepDefinitions {

    @Given("^We want to delete data from service \"([^\"]*)\"$")
    public void weWantToDeleteDataFromService(String url, List<User> userList) {

        url = url + userList.get(0).getUserName();
        System.out.println(url);
        SerenityRest.given().baseUri(url).header("accept","application/json").delete();

    }
}
