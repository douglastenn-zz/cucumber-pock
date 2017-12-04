package com.cucumber.test.functional.grandfathersend;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/grandfather-send.feature"}
)
public class GrandfatherSendConfiguration {
}