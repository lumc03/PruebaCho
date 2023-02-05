package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage {

    public static final Target INPUT_USERNAME = Target.the("Enter the username")
            .located(By.id("LoginPanel0_Username"));

    public static final Target INPUT_PASSWD = Target.the("Enter the password")
            .located(By.id("LoginPanel0_Password"));

    public static final Target BTN_SINGIN = Target.the("Click the button")
            .located(By.id("LoginPanel0_LoginButton"));

    public static final Target TXT_DASHBOARD = Target.the("Dashboard text")
            .located(By.className("content-header"));

    public static final Target MSG_ALERT = Target.the("Alert unsuccessful login")
            .located(By.id("toast-container"));


}
