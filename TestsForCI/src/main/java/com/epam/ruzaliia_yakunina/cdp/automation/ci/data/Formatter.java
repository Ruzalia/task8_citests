package com.epam.ruzaliia_yakunina.cdp.automation.ci.data;

import java.security.InvalidParameterException;

/**
 * Created by Ruzaliia_Yakunina on 12/2/2016.
 */
public class Formatter {
    private StringBuilder stringBuilder;
    private String surname;
    private String shortName;

    public Formatter() {
        stringBuilder = new StringBuilder();
    }

    public String formatFullName(String surname, String name) {
        if (surname == null || name == null) {
            throw new InvalidParameterException("Required parameters: String surname, String name.");
        }
        this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        shortName = name.substring(0, 1).toUpperCase();
        stringBuilder.append(this.surname).append(" ").append(shortName).append(".");
        return stringBuilder.toString();
    }
}
