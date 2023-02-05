package questions.Customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import questions.LogIn.SuccessfulLogIn;

import static userinterface.CustomerPage.NEW_CUSTOMER;



public class NewCustomer implements Question<Boolean> {



    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(NEW_CUSTOMER, WebElementStateMatchers.isVisible())
                .forNoMoreThan(180).seconds());
        return true;
    }

    public static NewCustomer displayed() {
        return new NewCustomer();
    }
}
