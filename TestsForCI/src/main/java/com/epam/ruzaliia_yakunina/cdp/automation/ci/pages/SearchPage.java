package com.epam.ruzaliia_yakunina.cdp.automation.ci.pages;

import org.openqa.selenium.By;

public class SearchPage {
    public static final By searchInputName = By.name("q");
    public static final By linksInSearchResult = By.cssSelector("h3.r a");
}
