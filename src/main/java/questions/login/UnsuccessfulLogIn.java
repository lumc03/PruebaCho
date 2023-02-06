package questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static userinterface.LogInPage.*;


public class UnsuccessfulLogIn implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MSG_ALERT, WebElementStateMatchers.isVisible())
                .forNoMoreThan(5).seconds());
        return Text.of(MSG_ALERT).viewedBy(actor).asString();
    }

    public static UnsuccessfulLogIn displayed() {
        return new UnsuccessfulLogIn();
    }
}
