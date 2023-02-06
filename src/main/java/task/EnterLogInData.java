package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.LogInPage.*;

public class EnterLogInData implements Task {

    private String username;
    private String passwd;

    public EnterLogInData(String username, String password) {
        this.username = username;
        this.passwd = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isVisible()).forNoMoreThan(120).seconds(),
                Enter.theValue(username).into(INPUT_USERNAME),
                Enter.theValue(passwd).into(INPUT_PASSWD),
                Click.on(BTN_SINGIN)
        );
    }

    public  static EnterLogInData with(String username, String password){
        return Tasks.instrumented(EnterLogInData.class, username, password);
    }
}
