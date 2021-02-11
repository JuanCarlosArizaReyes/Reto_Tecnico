package com.utes.retotecnico.tasks;

import com.utes.retotecnico.userinterface.UtesStepThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Stepthree implements Task {

    private String password;
    private String confpassword;

    public Stepthree(String password, String confpassword) {
        this.password = password;
        this.confpassword = confpassword;
    }

    public static Stepthree theLastS(String password, String confpassword) {
        return Tasks.instrumented(Stepthree.class,password,confpassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(password).into(UtesStepThree.INPUT_PASSW),
                Enter.theValue(confpassword).into(UtesStepThree.INPUT_CONPASSW),
                Click.on(UtesStepThree.INPUT_TERMS),
                Click.on(UtesStepThree.INPUT_PRIV),
                Click.on(UtesStepThree.COMP_SETUP)
        );

    }

}
