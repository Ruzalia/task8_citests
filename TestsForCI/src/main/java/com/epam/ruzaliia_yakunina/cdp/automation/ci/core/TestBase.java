package com.epam.ruzaliia_yakunina.cdp.automation.ci.core;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public abstract class TestBase {
    protected static WebDriver driver;
    private static final String CHROME_DRIVER_PATH = "src/test/resources/driver/chromedriver.exe";
    private static final String DRIVER_NAME = "webdriver.chrome.driver";

    private final String filePathForScreenshots = "target/reports/screenshots/";

    @BeforeClass
    public void setUp() {
        System.setProperty(DRIVER_NAME, CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(Scenario scenario) throws IOException, AWTException {
        if (scenario.isFailed()) {
            String currentDate = Calendar.getInstance().getTime().toString().replaceAll(":", "-");
            String fileName = "Screenshot_" + currentDate + ".jpg";
            File screenShotSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String directoryName = filePathForScreenshots;
            File screenShotDestination = new File(directoryName + fileName);
            try {
                FileUtils.copyFile(screenShotSrc, screenShotDestination);
            } catch (IOException e) {
                Reporter.log(e.getMessage());
            }
        }
        driver.quit();
    }
}
