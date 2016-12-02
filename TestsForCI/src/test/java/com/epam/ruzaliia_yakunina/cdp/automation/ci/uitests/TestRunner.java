package com.epam.ruzaliia_yakunina.cdp.automation.ci.uitests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ruzaliia_Yakunina on 6/17/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = {}, format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/java/com/epam/ruzaliia_yakunina/cdp/automation/ci/feature"})
public class TestRunner
{
}