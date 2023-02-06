package questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static userinterface.LogInPage.TXT_DASHBOARD;


public class SuccessfulLogIn implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TXT_DASHBOARD, WebElementStateMatchers.isVisible())
                .forNoMoreThan(5).seconds());
        return Text.of(TXT_DASHBOARD).viewedBy(actor).asString();
    }

    public static SuccessfulLogIn displayed() {
        return new SuccessfulLogIn();
    }
}
