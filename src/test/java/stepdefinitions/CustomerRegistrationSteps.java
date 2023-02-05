package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import questions.Customers.WrongData;
import questions.Customers.NewCustomer;
import task.CostumerModule.EnterCustomerData;
import task.CostumerModule.LinkCustomerModule;
import task.CostumerModule.SearchAddCustomer;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CustomerRegistrationSteps {

    @And("^the user navigates to the Customer module$")
    public void theUserNavigatesToTheCustomerModule() {
        theActorInTheSpotlight().attemptsTo(LinkCustomerModule.click());
    }

    @When("^enter the data into the form$")
    public void enterTheDataEnterTheDataIntoTheForm(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(EnterCustomerData.data(data.get(0)));
    }

    @And("^search for the \"([^\"]*)\" of the added customer$")
    public void searchForTheOfTheAddedCustomer(String customerId) {
        theActorInTheSpotlight().attemptsTo(SearchAddCustomer.search(customerId));

    }


    @Then("^should see the new customer in the list$")
    public void shouldSeeTheNewCustomerInTheList() {
        theActorInTheSpotlight().should(seeThat(NewCustomer.displayed(), is(equalTo(true))));
    }


    @Then("^the page should display a \"([^\"]*)\"$")
    public void thePageShouldDisplayA(String message) {
        theActorInTheSpotlight().should(seeThat(WrongData.displayed(), is(equalTo(message))));

    }
}
