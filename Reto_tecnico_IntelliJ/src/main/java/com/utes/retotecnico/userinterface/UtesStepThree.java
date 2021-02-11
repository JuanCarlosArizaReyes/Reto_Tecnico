package com.utes.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesStepThree {
    public static final Target INPUT_PASSW = Target.the("where the password is written")
            .located(By.id("password"));
    public static final Target INPUT_CONPASSW = Target.the("where the password is confirm")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_TERMS = Target.the("confirm terms")
            .located(By.id("termOfUse"));
    public static final Target INPUT_PRIV = Target.the("privacy and security policy")
            .located(By.id("privacySetting"));
    public static final Target COMP_SETUP = Target.the("select to complete setup ")
            .located(By.id("laddaBtn"));
}
