package setup.hook;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class ScenarioSet {
    @Before
    public void PrincipalSetUp(){
        setTheStage(new OnlineCast());
        theActor( "user");
    }
}
