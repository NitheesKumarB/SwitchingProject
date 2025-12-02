package com.common;

import com.microsoft.playwright.Page;
import com.pages.BasePage;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public static Page setUp() {
        return BasePage.getPage();
    }

    @After
    public static Page tearDown() {
       return  BasePage.closeBrowser();
    }
}
