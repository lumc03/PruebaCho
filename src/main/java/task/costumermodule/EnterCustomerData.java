package task.costumermodule;

import models.CustomerForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import java.util.Map;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.CustomerPage.*;
import static utils.Constants.*;

public class EnterCustomerData implements Task {

    private CustomerForm form;

    public EnterCustomerData(Map<String, String> data) {


            form = CustomerForm.builder()
                    .customerId(data.get(CUSTOMERID))
                    .companyName(data.get(COMPANY_NAME))
                    .email(data.get(EMAIL))
                    .phone(data.get(PHONE))
                    .address(data.get(ADDRESS))
                    .country(data.get(COUNTRY))
                    .city(data.get(CITY))
                    .representatives(data.get(REPRESENTATIVES))
                    .contactName(data.get(CONTACT_NAME))
                    .contactTitle(data.get(CONTACT_TITLE))
                    .body(data.get(BODY))
                    .build();


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (form.getBody().equals("requiredFieldEmpty")) {
            actor.attemptsTo(
                    Click.on(BTN_CUSTOMER),
                    WaitUntil.the(INPUT_CUSTOMERID, isVisible()).forNoMoreThan(120).seconds(),
                    Enter.theValue(form.getCustomerId()).into(INPUT_CUSTOMERID),
                    Enter.theValue(form.getCompanyName()).into(INPUT_COMPANYNAME),
                    Click.on(BTN_SAVE));
        } else {
            actor.attemptsTo(
                    Click.on(BTN_CUSTOMER),
                    WaitUntil.the(INPUT_CUSTOMERID, isVisible()).forNoMoreThan(120).seconds(),
                    Enter.theValue(form.getCustomerId()).into(INPUT_CUSTOMERID),
                    Enter.theValue(form.getCompanyName()).into(INPUT_COMPANYNAME),
                    Enter.theValue(form.getContactName()).into(INPUT_CONTACTNAME),
                    Enter.theValue(form.getContactTitle()).into(INPUT_CONTACTTITLE),
                    WaitUntil.the(DPLIST_REPRESENTATIVES, isVisible()).forNoMoreThan(120).seconds(),
                    Enter.theValue(form.getRepresentatives()).into(DPLIST_REPRESENTATIVES).thenHit(Keys.ENTER),
                    Enter.theValue(form.getAddress()).into(INPUT_ADDRESS),
                    Click.on(DPLIST_COUNTRY),
                    Enter.theValue(form.getCountry()).into(INPUT_COUNTRY).thenHit(Keys.ENTER),
                    Click.on(DPLIST_CITY),
                    Enter.theValue(form.getCity()).into(INPUT_CITY).thenHit(Keys.ENTER),
                    Enter.theValue(form.getPhone()).into(INPUT_PHONE),
                    Enter.theValue(form.getEmail()).into(INPUT_EMAIL),
                    Click.on(BTN_SAVE));
        }
    }

    public static EnterCustomerData data(Map<String, String> data) {
        return Tasks.instrumented(EnterCustomerData.class, data);
    }
}
