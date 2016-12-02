package com.epam.ruzaliia_yakunina.cdp.automation.ci.uitests;

import com.epam.ruzaliia_yakunina.cdp.automation.ci.core.TestBase;
import com.epam.ruzaliia_yakunina.cdp.automation.ci.data.PropertiesHandler;
import com.epam.ruzaliia_yakunina.cdp.automation.ci.pages.SearchPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ruzaliia_Yakunina on 6/17/2016.
 */
public class TestSteps extends TestBase {
    private final String filePathToData = "src/test/resources/data.properties";

    private PropertiesHandler handler;

    @Before
    public void setUp(){
        super.setUp();
        handler = new PropertiesHandler(filePathToData);
    }

    @Given("^I open search engine url$")
    public void iOpenGoogle() {
        System.out.println(handler.getProperty("url"));
        driver.get(handler.getProperty("url"));
    }

    @When("^I fill search input with search value$")
    public void iFillSearchInput() {
        WebElement searchInput = driver.findElement(SearchPage.searchInputName);
        searchInput.clear();
        searchInput.sendKeys(handler.getProperty("searchValue"));
        searchInput.sendKeys(Keys.ENTER);
    }

    @Then("^I can see search results$")
    public void iCanSeeSearchResults() {
        List<WebElement> linksInResult = driver.findElements(SearchPage.linksInSearchResult);
        Assert.assertNotNull("List of search results is empty.", linksInResult);
    }

    @After
    public void tearDown(Scenario scenario) throws IOException, AWTException {
        super.tearDown(scenario);
    }
}
