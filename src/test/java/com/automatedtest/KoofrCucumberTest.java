package com.automatedtest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/koofr/feature/Koofr.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
       glue = {"com.automatedtest.infrastructure.driver",
                "com.automatedtest.steps"})
public class KoofrCucumberTest {
}