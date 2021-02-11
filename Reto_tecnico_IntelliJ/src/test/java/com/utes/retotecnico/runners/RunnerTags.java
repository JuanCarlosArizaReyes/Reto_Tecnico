package com.utes.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utes.feature",
        tags = "@stories",
        glue = "com.utes.retotecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
