package com.epam.ruzaliia_yakunina.cdp.automation.ci.data;

import org.testng.Reporter;

import java.io.*;
import java.util.Properties;

public class PropertiesHandler {
    private Properties properties;
    private InputStream inputStream;
    private String filePath;

    public PropertiesHandler(String filePath) {
        properties = new Properties();
        this.filePath = filePath;
        try {
            inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            Reporter.log(e.getMessage());
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}

