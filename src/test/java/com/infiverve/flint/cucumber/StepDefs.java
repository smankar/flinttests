package com.infiverve.flint.cucumber;

import com.infiverve.flint.helpers.FlintAPIHelper;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by sandeepmankar on 2/28/16.
 */
public class StepDefs {

    @Given("^that (.*) flintbit is installed$")
    public void thatFlintbitIsInstalled(String flintbitName) throws Throwable {
        //TODO: Install testflintbit:DevBoxProvisioning.rb
        //Temporary workaround.. copy file manually to flint box
    }

    @When("^I run the (.*) flintbit$")
    public void runFlintbitByName(String flintbitName) throws Throwable {
        FlintAPIHelper helper = new FlintAPIHelper();
        helper.runFlintBit("{}",flintbitName);
    }

    @Then("^Dev box should be provisioned$")
    public void devBoxShouldBeProvisioned() throws Throwable {
        String response
                = RestAssured.given()
                .get("localhost:8023").asString();
        assertTrue("exit-code should be 0", response.contains("<html>"));
        System.out.print(response);

    }

    @Given("^I have a script to provision a DevBox$")
    public void iHaveAScriptToProvisionADevBox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^create (.*) flintbit$")
    public void createDevBoxProvisioningFlintbit(String flint) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^(.*) flintbit should be available to use$")
    public void flintbitShouldBeAvailableToUse(String flintbitName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
