package io.swagger.user.testing.stepDefinitions;

import cucumber.api.java.en.*;
import io.swagger.user.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class GetUserStepDefinitions {

    @Given("^We want to get data from service \"([^\"]*)\"$")
    public void weWantToGetDataFromService(String url, List<User> userList) {

        url = url + userList.get(0).getUserName();
        System.out.println(url);
        SerenityRest.given().baseUri(url).header("accept","application/json").get();


    }

}
