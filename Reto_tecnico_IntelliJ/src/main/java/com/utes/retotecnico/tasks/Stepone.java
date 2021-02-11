package com.utes.retotecnico.tasks;

import com.utes.retotecnico.userinterface.UtesStepone;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Stepone implements Task {

    private String fname;
    private String lname;
    private String email;

    public Stepone(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }


    public static Stepone onThePage(String fname, String lname, String email) {
        return Tasks.instrumented(Stepone.class,fname,lname,email);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
actor.attemptsTo(Click.on(UtesStepone.JOINTODAY_BUTTON),
        Enter.theValue(fname).into(UtesStepone.INPUT_FNAME),
        Enter.theValue(lname).into(UtesStepone.INPUT_LNAME),
        Enter.theValue(email).into(UtesStepone.INPUT_EMAIL),
        Click.on(UtesStepone.MONTH_BUTTON),
        Click.on(UtesStepone.MONTH_DEC),
        Click.on(UtesStepone.DAY_BUTTON),
        Click.on(UtesStepone.DAY_ELEV),
        Click.on(UtesStepone.YEAR_BUTTON),
        Click.on(UtesStepone.YEAR_NINE),
        Click.on(UtesStepone.NEXT_BUTTON)
        );
    }
}
