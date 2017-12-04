package com.cucumber.test.functional.grandfathersend;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GrandfatherSendRunSteps {

    @Given("^son and father are valid on dc-product$")
    public void init() {
        System.out.println("given");
    }

    @When("^grandfather arrives on dc-product")
    public void when_test() {
        System.out.println("when");
    }

    @And("^grandfather is valid$")
    public void and_test() {
        System.out.println("then");
    }

    @Then("^grandfather must be persisted on dc-product database$")
    public void then_test() {
        System.out.println("then");
    }

}