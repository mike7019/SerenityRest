package io.swagger.user.testing.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/io.swagger.user.testing.features/getuser.feature",
        glue = "io.swagger.user.testing.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GetUserRunner {
}
