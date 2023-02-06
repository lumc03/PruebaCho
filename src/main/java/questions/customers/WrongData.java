package questions.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.LogInPage.MSG_ALERT;


public class WrongData implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MSG_ALERT, WebElementStateMatchers.isVisible())
                .forNoMoreThan(5).seconds());
        return Text.of(MSG_ALERT).viewedBy(actor).asString();
    }

    public static WrongData displayed() {
        return new WrongData();
    }
}
