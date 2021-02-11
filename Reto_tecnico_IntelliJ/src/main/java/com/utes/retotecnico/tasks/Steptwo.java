package com.utes.retotecnico.tasks;

import com.utes.retotecnico.userinterface.UtesStepTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Steptwo implements Task {

    public static Steptwo onRegister() {
        return Tasks.instrumented(Steptwo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
actor.attemptsTo(Click.on(UtesStepTwo.NEXT_RIGHT),
        Click.on(UtesStepTwo.INPUT_MOBILE),
        Click.on(UtesStepTwo.INPUT_BRAND),
        Click.on(UtesStepTwo.INPUT_MODEL),
        Click.on(UtesStepTwo.INPUT_SMODEL),
        Click.on(UtesStepTwo.INPUT_SISO),
        Click.on(UtesStepTwo.INPUT_SSO),
        Click.on(UtesStepTwo.NEXT_RIGHT)
        );
    }
}
