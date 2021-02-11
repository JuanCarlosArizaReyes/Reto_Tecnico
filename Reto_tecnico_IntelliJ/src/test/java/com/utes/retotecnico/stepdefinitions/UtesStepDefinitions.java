package com.utes.retotecnico.stepdefinitions;

import com.utes.retotecnico.model.UtesData;
import com.utes.retotecnico.tasks.OpenUp;
import com.utes.retotecnico.tasks.Stepthree;
import com.utes.retotecnico.tasks.Stepone;
import com.utes.retotecnico.tasks.Steptwo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtesStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to register at the utes page$")
    public void thanJuanWantsToRegisterAtTheUtesPage(List<UtesData> utesData) throws Exception {
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage(), Stepone.
                onThePage(utesData.get(0).getFname(),utesData.get(0).getLname(),utesData.get(0).getEmail()));
    }


    @When("^he performs all the registration steps on the utes platform$")
    public void hePerformsAllTheRegistrationStepsOnTheUtesPlatform(List<UtesData> utesData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Steptwo.onRegister(), (Stepthree.
                theLastS(utesData.get(0).getPassword(),utesData.get(0).getConfpassword())));
    }

    @Then("^he completes the registration on the utes page$")
    public void heCompletesTheRegistrationOnTheUtesPage() {
    }

}
