package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.LogIn.SuccessfulLogIn;
import questions.LogIn.UnsuccessfulLogIn;
import task.EnterLogInData;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInSteps {
    @Given("^the user navigates to the login page$")
    public void theUserNavigatesToTheLoginPage() {

        theActorInTheSpotlight().wasAbleTo(new OpenUrl(URl));
    }

    @When("^enter the login data \"([^\"]*)\" and \"([^\"]*)\" in the form$")
    public void enterTheLoginDataAndInTheForm(String username, String password) {
        theActorInTheSpotlight().attemptsTo(EnterLogInData.with(username, password));

    }

    @Then("^the portal should display the \"([^\"]*)\" page$")
    public void thePortalShouldDisplayThePage(String title) {
        theActorInTheSpotlight().should(seeThat(SuccessfulLogIn.displayed(), is(equalTo(title))));
    }

    @Then("^the page should display the message \"([^\"]*)\"$")
    public void thePortalShouldDisplayTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(UnsuccessfulLogIn.displayed(), is(equalTo(message))));
    }


}
