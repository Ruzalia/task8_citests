package com.epam.ruzaliia_yakunina.cdp.automation.ci.integrationtests;

import com.epam.ruzaliia_yakunina.cdp.automation.ci.data.Formatter;
import com.epam.ruzaliia_yakunina.cdp.automation.ci.data.PropertiesHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Ruzaliia_Yakunina on 12/2/2016.
 */
public class FormatterWithPropertiesHandlerTest {
    private final String filePathToData = "src/test/resources/data.properties";
    private Formatter formatter;
    private PropertiesHandler propertiesHandler;

    @BeforeClass
    public void setUp(){
        formatter = new Formatter();
        propertiesHandler = new PropertiesHandler(filePathToData);
    }

    @Test
    public void verifyIfFormatterWorksWithDataFromFile(){
        String actual = formatter.formatFullName(propertiesHandler.getProperty("surname"), propertiesHandler.getProperty("name"));
        String expected = "Ivanov I.";
        Assert.assertEquals(actual, expected, "Result of formatting is incorrect: "+actual);
    }
}
