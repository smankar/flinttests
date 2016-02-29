package com.infiverve.flint.cucumber;

/**
 * Created by sandeepmankar on 2/28/16.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        tags = {"~@wip", "~@manual"},
        features = "classpath:flintfeatures")
public class RunCukesTest {
}