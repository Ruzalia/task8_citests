package com.epam.ruzaliia_yakunina.cdp.automation.ci.unittests;

import com.epam.ruzaliia_yakunina.cdp.automation.ci.data.Formatter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;

/**
 * Created by Ruzaliia_Yakunina on 12/2/2016.
 */
public class FormatterTest {
    private Formatter formatter;
    private final String SURNAME = "pavlov";
    private final String NAME = "pavlo";

    @BeforeClass
    public void setUp(){
        formatter = new Formatter();
    }

    @Test
    public void verifyIfFormatterWorksCorrectWithValidData(){
        String actual = formatter.formatFullName(SURNAME, NAME);
        String expected = "Pavlov P.";
        Assert.assertEquals(actual, expected, "Result of formatting is incorrect: "+actual);
    }

    @Test(expectedExceptions = InvalidParameterException.class)
    public void verifyIfFormatterThrowsExceptionWhenSurnameIsNull(){
        formatter.formatFullName(null, NAME);
    }

    @Test(expectedExceptions = InvalidParameterException.class)
    public void verifyIfFormatterThrowsExceptionWhenNameIsNull(){
        formatter.formatFullName(SURNAME, null);
    }
}
