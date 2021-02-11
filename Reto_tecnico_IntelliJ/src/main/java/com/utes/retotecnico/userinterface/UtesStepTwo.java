package com.utes.retotecnico.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesStepTwo {
    public static final Target NEXT_RIGHT = Target.the("to continue after autocomplete")
            .located(By.xpath("//i[contains(text(),'chevron_right')]"));
    public static final Target INPUT_MOBILE = Target.the("button to choose mobile device")
            .located(By.name("handsetMakerId"));
    public static final Target INPUT_BRAND = Target.the("button to select brand")
            .located(By.xpath("//div[contains(text(),'BenQ-Siemens')]"));
    public static final Target INPUT_MODEL = Target.the("button to choose mobile model")
            .located(By.name("handsetModelId"));
    public static final Target INPUT_SMODEL = Target.the("button to select model")
            .located(By.xpath("//div[contains(text(),'C81')]"));
    public static final Target INPUT_SISO = Target.the("button to choose operating system")
            .located(By.name("handsetOSId"));
    public static final Target INPUT_SSO = Target.the("button to select operating system")
            .located(By.xpath("//div[contains(text(),'Android 4.0')]"));
}
