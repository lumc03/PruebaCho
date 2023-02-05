package task.CostumerModule;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import task.EnterLogInData;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.CustomerPage.*;
import static userinterface.LogInPage.*;

public class LinkCustomerModule implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SIDE_MENU, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(SIDE_MENU),
                Click.on(LNK_CUSTOMER)
        );
    }

    public static LinkCustomerModule click() {
        return Tasks.instrumented(LinkCustomerModule.class);
    }
}
