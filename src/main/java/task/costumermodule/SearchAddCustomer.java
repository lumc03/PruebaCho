package task.costumermodule;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.CustomerPage.*;

public class SearchAddCustomer implements Task {

    private String customerId;

    public SearchAddCustomer(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(INPUT_SEARCH, isVisible()).forNoMoreThan(500).seconds(),
                Enter.theValue(customerId).into(INPUT_SEARCH)
        );
    }

    public static SearchAddCustomer search(String customerId) {
        return Tasks.instrumented(SearchAddCustomer.class, customerId);
    }
}
