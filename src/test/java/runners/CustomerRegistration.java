package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"stepdefinitions","setup.hook"},
        features = "src/test/resources/features/Customer_Registration.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome= true
)

public class CustomerRegistration {
}
