package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CustomerPage {

    public static final Target SIDE_MENU = Target.the("Menu")
            .locatedBy("a[href*=\"#nav_menu1_2_1\"]");

    public static final Target LNK_CUSTOMER = Target.the("Link Customer module")
            .locatedBy("a[href*=\"/Northwind/Customer\"]");

    public static final Target BTN_CUSTOMER = Target.the("New customer")
            .locatedBy("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]");

    public static final Target INPUT_CUSTOMERID = Target.the("Input customerId")
            .located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CustomerID"));

    public static final Target INPUT_COMPANYNAME = Target.the("Enter the company name")
            .located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CompanyName"));

    public static final Target INPUT_CONTACTNAME = Target.the("Enter the contact name")
            .located(By.name("ContactName"));


    public static final Target INPUT_CONTACTTITLE = Target.the("Enter the contact title")
            .located(By.name("ContactTitle"));


    public static final Target DPLIST_REPRESENTATIVES = Target.the("Enter the representative")
            .located(By.id("s2id_autogen4"));

    public static final Target INPUT_ADDRESS = Target.the("Enter the address")
            .located(By.name("Address"));


    public static final Target DPLIST_COUNTRY = Target.the("click in country")
            .located(By.id("s2id_Serenity_Demo_Northwind_CustomerDialog9_Country"));
    public static final Target INPUT_COUNTRY = Target.the("select a country")
            .located(By.id("s2id_autogen5_search"));


    public static final Target DPLIST_CITY = Target.the("click in city")
            .located(By.id("s2id_Serenity_Demo_Northwind_CustomerDialog9_City"));

    public static final Target INPUT_CITY = Target.the("select a city")
            .located(By.id("s2id_autogen6_search"));

    public static final Target INPUT_PHONE = Target.the("Enter the phone")
            .located(By.name("Phone"));

    public static final Target INPUT_EMAIL = Target.the("Enter the email")
            .located(By.name("Email"));

    public static final Target BTN_SAVE = Target.the("Button save new customer")
            .located(By.className("save-and-close-button"));

    public static final Target INPUT_SEARCH = Target.the("Input search customer")
            .located(By.className("s-Serenity-QuickSearchInput"));

    public static final Target NEW_CUSTOMER = Target.the("View new customer")
            .located(By.className("slick-row"));

}
