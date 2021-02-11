package com.utes.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesStepone {
    public static final Target JOINTODAY_BUTTON = Target.the("button that shows us the registration form")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FNAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LNAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target MONTH_BUTTON = Target.the("button to choose month")
            .located(By.id("birthMonth"));
    public static final Target MONTH_DEC = Target.the("button to choose month december")
            .located(By.xpath("//option[contains(text(),'December')]"));
    public static final Target DAY_BUTTON = Target.the("button to choose day")
            .located(By.id("birthDay"));
    public static final Target DAY_ELEV = Target.the("button to choose day eleven")
            .located(By.xpath("//option[contains(text(),'11')]"));
    public static final Target YEAR_BUTTON = Target.the("button to choose year")
            .located(By.id("birthYear"));
    public static final Target YEAR_NINE = Target.the("button to choose year ninety five")
            .located(By.xpath("//option[contains(text(),'1995')]"));
    public static final Target NEXT_BUTTON = Target.the("button that shows us the next location")
            .located(By.xpath("//i[contains(text(),'chevron_right')]"));

}
